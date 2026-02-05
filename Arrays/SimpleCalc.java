    public class SimpleCalc {
        public static int Calculate(int n1, int n2, char c){
            switch(c){
                case '+':
                    return n1+n2;
                case '-':
                    return n1-n2;
                case '*':
                    return n1*n2;
                case '/':
                    return n1/n2;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
            return -1;
        }
        public static void main(String[] args){
            System.out.println(Calculate(6, 2, '/'));
        }
    }
