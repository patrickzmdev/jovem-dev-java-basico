//package programacaofuncional_lambda.exemplo2;
//
//public class exemplos_lambda {
//
//	public static void main(String[] args) {
//
//		
//		public static List<Funcionario> obterTop10MaioresSalarios() {
//	        return getListaFuncionarios().stream()
//	            .sorted((f1, f2) -> f2.getSalario().compareTo(f1.getSalario()))
//	            .limit(10)
//	            .collect(Collectors.toList());
//	    }
//		
//		 public void testTop10MaioresSalarios() {
//		        List<Funcionario> top10 = CargaDados.obterTop10MaioresSalarios();
//		        assertEquals(10, top10.size());
//		        // Verifique se os salários estão em ordem decrescente
//		        for (int i = 0; i < top10.size() - 1; i++) {
//		            assertTrue(top10.get(i).getSalario().compareTo(top10.get(i + 1).getSalario()) >= 0);
//		        }
//		    }
//		
//		 
//		 public static Map<DepartamentoEnum, BigDecimal> mediaSalarioPorCargo() {
//		        return getListaFuncionarios().stream()
//		            .collect(Collectors.groupingBy(
//		                Funcionario::getCargo,
//		                Collectors.mapping(
//		                    Funcionario::getSalario,
//		                    Collectors.averagingBigDecimal(BigDecimal::doubleValue)
//		                )
//		            ))
//		            .entrySet().stream()
//		            .collect(Collectors.toMap(Map.Entry::getKey, e -> BigDecimal.valueOf(e.getValue())));
//		    }
//		 
//		 public void testMediaSalarioPorCargo() {
//		        Map<DepartamentoEnum, BigDecimal> mediaPorCargo = CargaDados.mediaSalarioPorCargo();
//		        assertTrue(mediaPorCargo.size() > 0);
//		        // Verifique se a média de salários está correta
//		    }
//		 
//		 public static BigDecimal calcularImpactoReajuste10Porcento() {
//		        BigDecimal percentualReajuste = new BigDecimal("0.10");
//		        return getListaFuncionarios().stream()
//		            .map(Funcionario::getSalario)
//		            .reduce(BigDecimal.ZERO, (total, salario) -> total.add(salario.multiply(percentualReajuste)))
//		            .setScale(2, BigDecimal.ROUND_HALF_UP);
//		    }
//		 
//		  public void testImpactoReajuste10Porcento() {
//		        BigDecimal impacto = CargaDados.calcularImpactoReajuste10Porcento();
//		        // Compare com o valor esperado com base na carga de dados
//		        assertEquals(new BigDecimal("valor_esperado"), impacto);
//		    }
//
//		  public static Map<DepartamentoEnum, Double> percentualPorCargo() {
//		        long totalFuncionarios = getListaFuncionarios().size();
//		        return getListaFuncionarios().stream()
//		            .collect(Collectors.groupingBy(
//		                Funcionario::getCargo,
//		                Collectors.counting()
//		            ))
//		            .entrySet().stream()
//		            .collect(Collectors.toMap(
//		                Map.Entry::getKey,
//		                entry -> (entry.getValue().doubleValue() / totalFuncionarios) * 100
//		            ));
//		    }
//		  
//		  @Test
//		    public void testPercentualPorCargo() {
//		        Map<DepartamentoEnum, Double> percentualPorCargo = CargaDados.percentualPorCargo();
//		        assertTrue(percentualPorCargo.size() > 0);
//		        // Verifique se a soma dos percentuais é 100
//		    }
//		  
//		  public static Map<DepartamentoEnum, EstatisticasSalario> estatisticasPorCargo() {
//		        return getListaFuncionarios().stream()
//		            .collect(Collectors.groupingBy(
//		                Funcionario::getCargo,
//		                Collectors.collectingAndThen(
//		                    Collectors.toList(),
//		                    lista -> {
//		                        List<BigDecimal> salarios = lista.stream()
//		                            .map(Funcionario::getSalario)
//		                            .sorted()
//		                            .collect(Collectors.toList());
//		                        BigDecimal min = salarios.get(0);
//		                        BigDecimal max = salarios.get(salarios.size() - 1);
//		                        BigDecimal media = salarios.stream()
//		                            .reduce(BigDecimal.ZERO, BigDecimal::add)
//		                            .divide(BigDecimal.valueOf(salarios.size()), BigDecimal.ROUND_HALF_UP);
//		                        BigDecimal moda = calcularModa(salarios);
//		                        BigDecimal mediana = calcularMediana(salarios);
//		                        return new EstatisticasSalario(min, max, media, moda, mediana);
//		                    }
//		                )
//		            ));
//		        
//		        private static BigDecimal calcularModa(List<BigDecimal> salarios) {
//		            Map<BigDecimal, Long> frequencias = salarios.stream()
//		                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//		            return frequencias.entrySet().stream()
//		                .max(Map.Entry.comparingByValue())
//		                .map(Map.Entry::getKey)
//		                .orElse(BigDecimal.ZERO);
//		        }
//
//		        private static BigDecimal calcularMediana(List<BigDecimal> salarios) {
//		            int size = salarios.size();
//		            if (size % 2 == 0) {
//		                return salarios.get(size / 2 - 1).add(salarios.get(size / 2)).divide(BigDecimal.valueOf(2));
//		            } else {
//		                return salarios.get(size / 2);
//		            }
//		        }
//		    }
//
//		    class EstatisticasSalario {
//		        private final BigDecimal min;
//		        private final BigDecimal max;
//		        private final BigDecimal media;
//		        private final BigDecimal moda;
//		        private final BigDecimal mediana;
//
//		        public EstatisticasSalario(BigDecimal min, BigDecimal max, BigDecimal media, BigDecimal moda, BigDecimal mediana) {
//		            this.min = min;
//		            this.max = max;
//		            this.media = media;
//		            this.moda = moda;
//		            this.mediana = mediana;
//		        }
//		        
//		        
//		        @Test
//		        public void testEstatisticasPorCargo() {
//		            Map<DepartamentoEnum, EstatisticasSalario> estatisticasPorCargo = CargaDados.estatisticasPorCargo();
//		            assertTrue(estatisticasPorCargo.size() > 0);
//		            // Verifique se os valores das estatísticas estão corretos
//		        }
//		        
//		        
//		        
//		        public static DepartamentoEnum departamentoMaiorOrcamento() {
//		            return getListaFuncionarios().stream()
//		                .collect(Collectors.groupingBy(
//		                    Funcionario::getCargo,
//		                    Collectors.mapping(
//		                        Funcionario::getSalario,
//		                        Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)
//		                    )
//		                ))
//		                .entrySet().stream()
//		                .max(Map.Entry.comparingByValue())
//		                .map(Map.Entry::getKey)
//		                .orElse(null);
//		        }
//		    }
//		    
//		    @Test
//		    public void testDepartamentoMaiorOrcamento() {
//		        DepartamentoEnum departamento = CargaDados.departamentoMaiorOrcamento();
//		        assertNotNull(departamento);
//		        // Verifique se o departamento retornado é o correto
//		    }
//	}
//	public static DepartamentoEnum departamentoMaiorMediaSalarial() {
//        return getListaFuncionarios().stream()
//            .collect(Collectors.groupingBy(
//                Funcionario::getCargo,
//                Collectors.collectingAndThen(
//                    Collectors.toList(),
//                    lista -> {
//                        BigDecimal somaSalarios = lista.stream()
//                            .map(Funcionario::getSalario)
//                            .reduce(BigDecimal.ZERO, BigDecimal::add);
//                        BigDecimal media = somaSalarios.divide(BigDecimal.valueOf(lista.size()), BigDecimal.ROUND_HALF_UP);
//                        return media;
//                    }
//                )
//            ))
//            .entrySet().stream()
//            .max(Map.Entry.comparingByValue())
//            .map(Map.Entry::getKey)
//            .orElse(null);
//    }
//	
//	 @Test
//	    public void testDepartamentoMaiorMediaSalarial() {
//	        DepartamentoEnum departamento = CargaDados.departamentoMaiorMediaSalarial();
//	        assertNotNull(departamento);
//	        // Verifique se o departamento retornado é o correto
//	    }
//	
//
//}
