import org.junit.Test;

import java.util.Scanner;

class ValidateCard {
    public boolean CheckLuhn(String CardNo) {
        int Digits = CardNo.length();
        long Sum = 0;
        boolean even = false;
        for(int digitPosition = Digits-1; digitPosition>=0; digitPosition--){

            char currentcharacter = CardNo.charAt(digitPosition);
            int currentDigit = currentcharacter - '0';

            if(Character.isLetter(currentcharacter))
                return false;

            if(even){
                currentDigit *= 2;
            }
            Sum += currentDigit / 10;
            Sum += currentDigit % 10;

            even = !even;
        }
        return (Sum % 10 == 0);
    }
}
public class CardValidation {
    public static void main(String[] args) {

        String cardNo;
        Scanner input = new Scanner(System.in);
        cardNo = input.nextLine();
        ValidateCard card = new ValidateCard();
        if(card.CheckLuhn(cardNo)){
            System.out.println("valid card");
        }
        else {
            System.out.println("Not a valid card");
        }
    }
}
