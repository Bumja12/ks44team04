package ks44team04.util;

public class CodeIndex {

    public String codeIndex(String code, int index) {

            String codeStr = code.substring(0, index);
            String codeNum = code.substring(index);
            int numLength = codeNum.length();
            int num = Integer.parseInt(codeNum);

            String resultNum = String.format("%0"+numLength+"d", num + 1);
            String result = codeStr + resultNum;

        return result;
    }
}
