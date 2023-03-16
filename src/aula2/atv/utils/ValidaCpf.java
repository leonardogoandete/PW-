package aula2.atv.utils;

public interface ValidaCpf {
    static boolean isCpf(String cpf) {
    boolean flag = false;
        if(cpf.length() == 11) {
            flag = true;
        }
        return flag;
    }

}
