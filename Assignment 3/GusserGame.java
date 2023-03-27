import java.util.Scanner;

public class GusserGame
{
    public static void main(String[] args)
    {
        int noOfPlayer;
        Scanner s = new Scanner(System.in);
        int i =0;
        System.out.println("-----------UMPIRE -------------------");
        System.out.println("enter the number of Player");
        noOfPlayer = s.nextInt();
        player[] p = new player[noOfPlayer];
        while(i<noOfPlayer)
        {
            p[i] = new player(i);
            i++;
        }
        i =0;
        p[0].input();
        System.out.println("game start here ");
        while(true)
        {
          if(i==noOfPlayer)
          {
              i =0;
          }
          else
          {
              boolean r=true;
              p[i].guessNum();
              boolean re =p[i].check();
              if(re)
              {

                  System.out.println("===========================Game Over =================");
                  break;
              }
              i++;
              int x =0;
              while(x<noOfPlayer)
              {
                  if(p[x].attemptleft!=0)
                  {
                      r =false;
                  }
                  x++;
              }
              if(r)
              {

                  System.out.println("every one reached at there limit of attempt ");
                  System.out.println("===========================Game Over =================");
                  break;
              }
          }
        }
    }
}

abstract class Umpire
{
    static int realNum;
    Scanner i = new Scanner(System.in);

    public abstract boolean check();

    public void input()
    {
        System.out.println("select the number as an Umpire");

        realNum = i.nextInt();

    }
}
class player extends Umpire
{
    String name;
    int attemptleft=5;
    int guessnumber;
    int hintNo =3;

    player(int o)
    {
        System.out.println("enter the name of player "+(o+1));
        name = i.next();
    }
    public void dipslay()
    {
        System.out.println("name"+name);
        System.out.println("life line "+attemptleft);

    }
    public void guessNum()
    {
        System.out.println("Player "+name+"-->guess the number");
        guessnumber = i.nextInt();
   }

    @Override
    public boolean check()
    {
        if(attemptleft>0)
        {
            if(realNum !=guessnumber)
            {
                char x;
                System.out.println("Player "+name+" -- > Number not Matched ");
                attemptleft--;
                System.out.println("Do you want hint Y OR N");
                x = i.next().charAt(0);
                if(x == 'y' || x == 'Y')
                {
                    hint();

                }

            }
            else
            {
                System.out.println("player "+name+" win the game ");
                return true;
            }
        }
        else {
            System.out.println("You reached your limits of attempt");
        }
        return false;
    }

    private void hint()
    {
        if(hintNo == 3)
        {
            if(guessnumber>realNum)
            {
                System.out.println("please try some smaller number ");
            }
            else
            {
                System.out.println("please try some bigger number ");
            }
            hintNo--;
        }else if(hintNo == 2)
        {
            if(realNum%2==0)
            {
                System.out.println("the number is EVEN ");
            }
            else
            {
                System.out.println("the number is odd ");
            }
            hintNo--;
        }
        else if(hintNo ==1) {
            if (realNum % 5 == 0) {
                System.out.println("the number is Multiple of 5 ");
            } else {
                System.out.println("the number is not Multiple of 5 ");
            }
            hintNo--;
        }
        else
        {
            System.out.println("You reached your limits for hint ");
        }
    }
    void display()
    {
        System.out.println("the Number is ====> "+realNum);
    }
}

