import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

// ¿À´Ã Ä«Ä«¿À ÄÚÅ× ºÁ¼­ ÈûÀÌ ³Ê¹« ¾ø´ç ¤Ì

public class Main_2800 {
    public static class Pair{
        int leftIndex;
        int rightIndex;

        Pair(int leftIndex, int rightIndex){
            this.leftIndex = leftIndex;
            this.rightIndex = rightIndex;
        }
    }
    public static ArrayList<Pair> pairs;     // °ýÈ£ ½Ö ÀÎµ¦½º ¸®½ºÆ®
    public static int N;                    // °ýÈ£ ½ÖÀÇ °¹¼ö
    public static char[] expression;
    public static String originalExpression;
    public static HashSet<String> removedExpressions;

    public static void main(String[] args) throws Exception{
        BufferedReader  br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //¼ö½Ä¹®ÀÚ¿­À» char ¸®½ºÆ®·Î ¹Þ±â
        String originalExpression = br.readLine().trim();
        expression = new char[originalExpression.length()];
        for(int index = 0 ;index<originalExpression.length(); index++){
            expression[index] = originalExpression.charAt(index);
        }

        //°ýÈ£½ÖÀÇ ÀÎµ¦½º¸¦ Ã£±â
        pairs = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int index = 0 ; index<expression.length; index++){
            char currentChar = expression[index];
            if(currentChar =='('){
                stack.push(index);
            }
            else if(currentChar==')'){
                Pair pair = new Pair(stack.pop(),index);
                pairs.add(pair);
            }
        }

        removedExpressions = new HashSet<>();           //  °ýÈ£°¡ Á¦°ÅµÈ ¼ö½Ä
        N = pairs.size();                               // °ýÈ£½ÖÀÇ °¹

        removePair(0,expression);

        List removedExpressionList = new ArrayList(removedExpressions);
        Collections.sort(removedExpressionList);

        for(int index = 0; index<removedExpressionList.size(); index++){
            if(!removedExpressionList.get(index).equals(originalExpression)){
                bw.write(removedExpressionList.get(index)+"\n");
            }
        }

        bw.flush();

    }
    public static void removePair(int index, char[] expression){
        if(index>=N){
            String removeExpression = new String(expression);
            removeExpression=removeExpression.replaceAll(" ", "");
            removedExpressions.add(removeExpression);
        }
        else{
            Pair currentPair= pairs.get(index);

            //currentPair»èÁ¦
            expression[currentPair.leftIndex] = ' ';
            expression[currentPair.rightIndex]= ' ';
            removePair(index+1, expression);

            // currentPair»èÁ¦¾ÈÇÔ
            expression[currentPair.leftIndex] = '(';
            expression[currentPair.rightIndex]= ')';
            removePair(index+1, expression);




        }
    }
}