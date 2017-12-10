public class ArrayComparator {


    boolean compare(int [][] tab1, int [][] tab2){
        boolean check = true;

        for(int i = 0; i<tab1.length;i++){
            for(int j = 0; j<tab1[i].length;j++){
                if (tab1[i][j]!=tab2[i][j]){
                    check = false;
                }
            }
        }

        return check;

    }





}
