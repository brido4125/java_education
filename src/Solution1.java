import java.util.*;


public class Solution1 {
    public static void removeFirstPiece(List<Integer> px){
        int sum = 0;
        for (Integer integer : px) {
            sum += integer;
        }
        int avg = sum / px.size();
        if(px.get(0) > px.get(1) * 10){
            px.set(0,avg);
        }
    }

    public static int maxDifference(List<Integer> px) {
        // Write your code here
        removeFirstPiece(px);
        int res;
        List<Integer> resList = new ArrayList<>();
        for(int i = 1; i < px.size(); i++){
            if(px.get(i) == px.get(i-1)){
                break;
            }
            for(int j = 0 ; j <= i - 1; j++){
                int valueI = px.get(i);
                int valueJ = px.get(j);
                if(valueI > valueJ){
                    int tmp = px.get(i) - px.get(j);
                    resList.add(tmp);
                }else{
                    break;
                }
            }
        }
        resList.sort(Comparator.naturalOrder());
        System.out.println(resList);
        System.out.println(px);

        if(resList.size() == 0){
            return -1;
        }
        res = resList.get(resList.size()-1);
        return res;
    }
}
