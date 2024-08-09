package main.features.media_por_cargo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.utils.CargaDados;
import main.utils.DepartamentoEnum;
import main.utils.Funcionario;
import main.utils.MapeiaDados;

public class MediaPorCargo {

    MapeiaDados m = new MapeiaDados();

    Map<DepartamentoEnum, List<Funcionario>> mapaFunc = new MapeiaDados()
            .mapeiaFuncionariosPorCargo(new CargaDados().getListaFuncionarios());

    public Map<DepartamentoEnum, BigDecimal> media(Map<DepartamentoEnum, List<Funcionario>> mapaFunc) {
        Map<DepartamentoEnum, BigDecimal> mapaMedias = new HashMap<>();

        for (DepartamentoEnum iterador : DepartamentoEnum.values()) {
            List<Funcionario> funcionarios = mapaFunc.get(iterador);
            if (funcionarios != null && !funcionarios.isEmpty()) {
                BigDecimal soma = BigDecimal.ZERO;

                // Soma os salários de todos os funcionários
                for (Funcionario func : funcionarios) {
                    soma = soma.add(func.getSalario());
                }

                // Calcula a média dividindo pela quantidade de funcionários
                BigDecimal media = soma.divide(BigDecimal.valueOf(funcionarios.size()), BigDecimal.ROUND_HALF_UP);

                // Adiciona a média ao mapa
                mapaMedias.put(iterador, media);
            } else {
                // Se não houver funcionários, a média pode ser considerada zero ou não ser calculada
                mapaMedias.put(iterador, BigDecimal.ZERO);
            }
        }

        return mapaMedias;
    }
}
