package Sets;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board){ 
        Set<String> seen = new HashSet<>();
        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                char num = board[i][j];
                if(num == '.'){
                    continue;
                }
                String rowkey = num + "in row" + i;
                String colkey = num + "in column" + j;
                String boxkey = num + "in box" + (i/3) + "-" + (j/3);
                if(seen.contains(rowkey) || seen.contains(colkey) || seen.contains(boxkey)){
                    return false;
                }

                seen.add(rowkey);
                seen.add(colkey);
                seen.add(boxkey);
            }
        }
        return true;
    }
}
