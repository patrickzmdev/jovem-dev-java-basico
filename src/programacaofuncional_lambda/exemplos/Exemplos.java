//package programacaofuncional_lambda.exemplos;
//
//public class Exemplos {
//
//	public static void main(String[] args) {
//		
////		public static List<Funcionario> getFuncionariosPorDepartamento(DepartamentoEnum departamento) {
////	        return getListaFuncionarios().stream()
////	            .filter(f -> f.getCargo().equals(departamento))
////	            .collect(Collectors.toList());
////	    }
////		
////		  public static List<Funcionario> getFuncionariosOrdenadosPorSalario() {
////		        return getListaFuncionarios().stream()
////		            .sorted(Comparator.comparing(Funcionario::getSalario).reversed())
////		            .collect(Collectors.toList());
////		    }
////
////		 
////
////			    public static Optional<Funcionario> getFuncionarioComMaiorSalario() {
////			        return getListaFuncionarios().stream()
////			            .max(Comparator.comparing(Funcionario::getSalario));
////			    }
////			}
////		  
////		  public static BigDecimal calcularMediaSalarios() {
////		        return getListaFuncionarios().stream()
////		            .map(Funcionario::getSalario)
////		            .reduce(BigDecimal.ZERO, BigDecimal::add)
////		            .divide(BigDecimal.valueOf(getListaFuncionarios().size()), RoundingMode.HALF_UP);
////		    }
////		  
////		  public static Map<DepartamentoEnum, Long> contarFuncionariosPorDepartamento() {
////		        return getListaFuncionarios().stream()
////		            .collect(Collectors.groupingBy(Funcionario::getCargo, Collectors.counting()));
////		    }
////		  
////		  public static Map<DepartamentoEnum, List<Funcionario>> filtrarEAgruparFuncionariosPorSalario(BigDecimal salarioMinimo) {
////		        return getListaFuncionarios().stream()
////		            .filter(f -> f.getSalario().compareTo(salarioMinimo) > 0)
////		            .collect(Collectors.groupingBy(Funcionario::getCargo));
////		    }
//		
//		public static Map<DepartamentoEnum, BigDecimal> totalSalarioPorDepartamento() {
//	        return getListaFuncionarios().stream()
//	            .collect(Collectors.groupingBy(
//	                Funcionario::getCargo,
//	                Collectors.mapping(
//	                    Funcionario::getSalario,
//	                    Collectors.reducing(BigDecimal.ZERO, BigDecimal::add)
//	                )
//	            ));
//	    }
//		
//		public static Optional<Funcionario> getFuncionarioMaisProximoSalario(BigDecimal valor) {
//	        return getListaFuncionarios().stream()
//	            .min((f1, f2) -> {
//	                BigDecimal diff1 = f1.getSalario().subtract(valor).abs();
//	                BigDecimal diff2 = f2.getSalario().subtract(valor).abs();
//	                return diff1.compareTo(diff2);
//	            });
//	    }
//		
//		public static List<Funcionario> getFuncionariosAcimaDaMedia() {
//	        BigDecimal mediaSalario = calcularMediaSalarios();
//	        return getListaFuncionarios().stream()
//	            .filter(f -> f.getSalario().compareTo(mediaSalario) > 0)
//	            .collect(Collectors.toList());
//	    }
//		
//		public static List<Funcionario> getFuncionariosSalarioNoIntervalo(BigDecimal salarioMin, BigDecimal salarioMax) {
//	        return getListaFuncionarios().stream()
//	            .filter(f -> f.getSalario().compareTo(salarioMin) >= 0 && f.getSalario().compareTo(salarioMax) <= 0)
//	            .collect(Collectors.toList());
//	    }
//		
//		 public static Map<String, Long> contarFuncionariosPorFaixaSalarial() {
//		        return getListaFuncionarios().stream()
//		            .collect(Collectors.groupingBy(f -> {
//		                BigDecimal salario = f.getSalario();
//		                if (salario.compareTo(new BigDecimal("5000")) < 0) return "Menos de 5000";
//		                if (salario.compareTo(new BigDecimal("10000")) < 0) return "5000 a 10000";
//		                return "10000 ou mais";
//		            }, Collectors.counting()));
//		    }
//		 
//		 public static boolean existeFuncionarioNoDepartamento(DepartamentoEnum departamento) {
//		        return getListaFuncionarios().stream()
//		            .anyMatch(f -> f.getCargo().equals(departamento));
//		    }
//		 
//		 public static Set<DepartamentoEnum> listarDepartamentosComFuncionarios() {
//		        return getListaFuncionarios().stream()
//		            .map(Funcionario::getCargo)
//		            .collect(Collectors.toSet());
//		    }
//		 
//		 public static Map<DepartamentoEnum, SalarioEstatisticas> estatisticasSalarioPorDepartamento() {
//		        return getListaFuncionarios().stream()
//		            .collect(Collectors.groupingBy(
//		                Funcionario::getCargo,
//		                Collectors.collectingAndThen(
//		                    Collectors.toList(),
//		                    lista -> {
//		                        BigDecimal max = lista.stream().map(Funcionario::getSalario).max(BigDecimal::compareTo).orElse(BigDecimal.ZERO);
//		                        BigDecimal min = lista.stream().map(Funcionario::getSalario).min(BigDecimal::compareTo).orElse(BigDecimal.ZERO);
//		                        BigDecimal media = lista.stream().map(Funcionario::getSalario).reduce(BigDecimal.ZERO, BigDecimal::add)
//		                            .divide(BigDecimal.valueOf(lista.size()), RoundingMode.HALF_UP);
//		                        return new SalarioEstatisticas(max, min, media);
//		                    }
//		                )
//		            ));
//		    }
//		 
//		 class SalarioEstatisticas {
//			    private final BigDecimal max;
//			    private final BigDecimal min;
//			    private final BigDecimal media;
//
//			    public SalarioEstatisticas(BigDecimal max, BigDecimal min, BigDecimal media) {
//			        this.max = max;
//			        this.min = min;
//			        this.media = media;
//			    }
//
//			    public BigDecimal getMax() { return max; }
//			    public BigDecimal getMin() { return min; }
//			    public BigDecimal getMedia() { return media; }
//
//			    @Override
//			    public String toString() {
//			        return String.format("Max: %s, Min: %s, Média: %s", max, min, media);
//			    }
//		
//		
////		  
////		  @Test
////		    public void testGetFuncionariosPorDepartamento() {
////		        List<Funcionario> administracao = CargaDados.getFuncionariosPorDepartamento(DepartamentoEnum.ADMINISTRACAO);
////		        assertEquals(4, administracao.size(), "Deve haver 4 funcionários no departamento de Administração.");
////		    }
////
////		    @Test
////		    public void testGetFuncionariosOrdenadosPorSalario() {
////		        List<Funcionario> ordenados = CargaDados.getFuncionariosOrdenadosPorSalario();
////		        assertEquals("Bruno Gomes", ordenados.get(0).getNome(), "O funcionário com maior salário deve ser Bruno Gomes.");
////		        assertEquals("Ana Santos", ordenados.get(ordenados.size() - 1).getNome(), "O funcionário com menor salário deve ser Ana Santos.");
////		    }
//	}
//
//}
