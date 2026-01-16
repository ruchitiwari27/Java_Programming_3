package Abstraction;
    abstract class TV//anstraction class
    {
        abstract void TurnON();//abstract method

        abstract void TurnOff();
    }

    // Concrete class implementing the abstract methods
    class TVRemote  extends TV
    {
        @Override
        void TurnON()
        {
            System.out.println("turn on the TV");
        }
        @Override void TurnOff()
        {
            System.out.println("turn off the TV");}
    }


    class Ruchi
    {
        public static void main (String[]args)
        {
            TV remote= new TVRemote();
            remote.TurnON();
            remote.TurnOff();
        }
    }

