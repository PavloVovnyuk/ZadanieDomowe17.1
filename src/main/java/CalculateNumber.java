public class CalculateNumber {

    public int calculateElements(int limit){
        int elem1 = 1;
        int elem2 = 1;
        int sum = 0;
        int suma1 = 0;

        for (int i = 0; i < limit; i++) {
            sum = elem1 + elem2;
            elem1 = elem2;
            elem2 = sum;
            if (sum % 2 == 0) {
                suma1 += sum;
            }
        }
        System.out.println(suma1);
        return suma1;
    }
}

