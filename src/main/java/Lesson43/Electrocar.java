package Lesson43;
    public  class Electrocar {
        private int id;
//вложенный нестатический класс
        private class Motor{
            public void starMotor() {
                System.out.println("Motor"+id+ "is starting...");
            }
        }
        //вложенный статический класс
        public static class Battery {
            public void charge() {
                System.out.println("Battery is charging...");
            }

        }

        public Electrocar(int id){
            this.id = id;
        }
        public void start() {
            Motor motor = new Motor();
            motor.starMotor();

            final int x = 1;

            class SomeClass{
                public void someMethod() {
                    System.out.println(x);
                    System.out.println(id);

                }
            }
            SomeClass someObject= new SomeClass();
            test(someObject);
            System.out.println("Electrocar"+id+" is starting...");
        }
        private void test(Object object){

        }
    }

