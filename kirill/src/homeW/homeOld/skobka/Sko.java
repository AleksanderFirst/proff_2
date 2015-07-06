package skobka;

public class Sko {
    public boolean Skob(String x) {
        char open = '(';
        char close = ')';
        int countO=0, countC=0;
        char[] array = x.toCharArray();
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==open)
                countO++;
            if (array[i]==close)
                countC++;
        }
        if (countC==countO){
            System.out.println(true);
//            System.out.println(Arrays.toString(array));
        return true;}
        else {
            System.out.println(false);
            return false;
        }
    }
}
