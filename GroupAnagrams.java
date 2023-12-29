package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void anagram(String[] strs){
        HashMap<String, List<String>> temp = new HashMap<>();
        List<List<String>> out = new ArrayList<>();

        for (int i=0; i<strs.length; i++){
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String tempStr = new String(a);

            if (temp.get(tempStr) != null){
                temp.get(tempStr).add(strs[i]);
            }else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                temp.put(tempStr, newList);
            }
        }
//        System.out.println(temp);

        for (List<String> mylist : temp.values()){
            out.add(mylist);
        }

        System.out.println(out);
    }

    public static void main(String[] args) {
        String[] temp = {"eat","tea","tan","ate","nat","bat"};
        anagram(temp);
    }
}
