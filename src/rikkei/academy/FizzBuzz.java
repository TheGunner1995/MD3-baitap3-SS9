package rikkei.academy;

public class FizzBuzz {
    public static String CheckFizzBuzz(int num){
        String sr="";
        if (num % 3 == 0 && num % 5 ==0){
            switch (num/10) {
                case 1:
                    return sr = "FizzBuzz" + "" + "mười năm";
                case 3:
                    return sr = "FizzBuzz" + "" + "ba mươi";
                case 4:
                    return sr = "FizzBuzz" + "" + "bốn năm";
                case 6:
                    return sr = "FizzBuzz" + "" + "sáu mươi";
                case 7:
                    return sr = "FizzBuzz" + "" + "bảy năm";
                case 9:
                    return sr = "FizzBuzz" + "" + "chín mươi";
                default:
                    break;
            }
        } else if (num % 5 == 0) {
            sr = "Buzz";
        } else if (num % 3 == 0) {
            sr = "Fizz";
        } else {
            sr = "null";
        }




        if (num/10 == 3){
            switch (num%10){
                case 0:
                    return sr = "Fizz" + "" + "ba mươi";
                case 1:
                    return sr = "Fizz" + "" + "ba mốt";
                case 2:
                    return sr = "Fizz" + "" + "ba hai";
                case 3:
                    return sr = "Fizz" + "" + "ba ba";
                case 4:
                    return sr = "Fizz" + "" + "ba bốn";
                case 5:
                    return sr = "Fizz" + "" + "ba năm";
                case 6:
                    return sr = "Fizz" + "" + "ba sáu";
                case 7:
                    return sr = "Fizz" + "" + "ba bảy";
                case 8:
                    return sr = "Fizz" + "" + "ba tám";
                case 9:
                    return sr = "Fizz" + "" + "ba chín";
                default:
                    break;
            }
        }

        if (num/10 == 5){
            switch (num%10){
                case 0:
                    return sr = "Buzz" + "" + "năm mươi";
                case 1:
                    return sr = "Buzz" + "" + "năm mốt";
                case 2:
                    return sr = "Buzz" + "" + "năm hai";
                case 3:
                    return sr = "Buzz" + "" + "năm ba";
                case 4:
                    return sr = "Buzz" + "" + "năm bốn";
                case 5:
                    return sr = "Buzz" + "" + "năm năm";
                case 6:
                    return sr = "Buzz" + "" + "năm sáu";
                case 7:
                    return sr = "Buzz" + "" + "năm bảy";
                case 8:
                    return sr = "Buzz" + "" + "năm tám";
                case 9:
                    return sr = "Buzz" + "" + "năm chín";
                default:
                    break;
            }
        }


        if (num%10==3){
            switch (num/10){
                case 0:
                    return sr = "Fizz" + "" + "ba";
                case 1:
                    return sr = "Fizz" + "" + "mười ba";
                case 2:
                    return sr = "Fizz" + "" + "hai ba";
                case 3:
                    return sr = "Fizz" + "" + "ba ba";
                case 4:
                    return sr = "Fizz" + "" + "bốn ba";
                case 5:
                    return sr = "Fizz" + "" + "năm ba";
                case 6:
                    return sr = "Fizz" + "" + "sáu ba";
                case 7:
                    return sr = "Fizz" + "" + "bảy ba";
                case 8:
                    return sr = "Fizz" + "" + "tám ba";
                case 9:
                    return sr = "Fizz" + "" + "chín ba";
                default:
                    break;
            }
        }else if (num%10==5){
            switch (num/10){
                case 0:
                    return sr = "Buzz" + "" + "năm";
                case 1:
                    return sr = "Buzz" + "" + "mười năm";
                case 2:
                    return sr = "Buzz" + "" + "hai năm";
                case 3:
                    return sr = "Buzz" + "" + "ba năm";
                case 4:
                    return sr = "Buzz" + "" + "bốn năm";
                case 5:
                    return sr = "Buzz" + "" + "năm năm";
                case 6:
                    return sr = "Buzz" + "" + "sáu năm";
                case 7:
                    return sr = "Buzz" + "" + "bảy năm";
                case 8:
                    return sr = "Buzz" + "" + "tám năm";
                case 9:
                    return sr = "Buzz" + "" + "chín năm";
                default:
                    break;
            }
        }else {
            sr = "null";
        }



        return sr;
    }
}
