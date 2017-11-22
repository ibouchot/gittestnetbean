package javanetbean1;

import java.util.Scanner;
/**
 * 
 * @author ivan
 */
public class FFdebugTest {

    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    /**
     * it is a value
     * @param myArray 
     */
    
    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.findMax(debug.myArray));
    }

    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }
    
    public int[] getMyArray() {
        return myArray;
    }

    public int getMyInt() {
        return myInt;
    }

    public boolean isMyBoolean() {
        return myBoolean;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
    

}

