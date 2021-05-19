//marriage, housing, pets, life events, stats\\
import java.util.Scanner;
import java.util.Random;

public class extraneous extends Runner
{
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);
    Random r = new Random();

    String name = "";
    int age = 18;
    String job = "";
    int money = 0;
    int kid = 0;
    boolean college = false;
    int salary = 0;
    String gender = "";
    Random r2 = new Random();
    Random r3 = new Random();
    int choice = 0;
    int choice1 = 0;
    boolean marriage = false;
    public void welcome()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Game of Life!");
        System.out.println("What is your name?");
        name = s.nextLine();
        System.out.println("What is your gender? m/f/n");

        gender = s.nextLine();
        System.out.println("Welcome " + name + " to your life. You are 18 years old and faced with a decision.");

    }

    public void marriage()
    {
        choice = s.nextInt();
        if(choice == 1)
        {
            marriage = true;
            System.out.println("Congratulations on getting married! You got a lot of gifts and had a great night, however, you still owe $3,000 for the ceremony.");
            money = money - 3000;

        }
        if(choice == 2)
        {
            marriage = false;
            System.out.println("You chose to be single forever. Maybe you will get a cat if you don't have one already...");

        }

    }
    String housing = "";
    public void housing()
    {
        System.out.println("Housing Options-");
        System.out.println("Option 1- Splitlevel (Cost:$70,000)");
        System.out.println("Option 2- Middle Home (Cost:$100,000)");
        System.out.println("Option 3- Country Cottage (Cost:$120,000)");
        System.out.println("Option 4- Beach House (Cost:$150,000)");
        System.out.println("Option 5- Farmhouse (Cost:$175,000)");
        System.out.println("Option 6- Mansion (Cost:$300,000)");
        choice1 = s1.nextInt();

        if(choice1 == 1)
        {
            money = money - 70000;
            housing.equals("Splitlevel");
            System.out.println("Congrats! You purchased the Splitlevel home. Your new balance is: " + money);
        }
        if (choice1 == 2)
        {
            money = money - 100000;
            housing.equals("Middle Home");
            System.out.println("Congrats! You purchased the Middle home. Your new balance is: " + money);
        }
        if (choice1 == 3)
        {
            money = money - 120000;
            housing.equals("Country Cottage");
            System.out.println("Congrats! You purchased the Country Cottage. Your new balance is: " + money);
        }
        if (choice1 == 4)
        {
            money = money - 120000;
            housing.equals("Beach House");
            System.out.println("Congrats! You purchased the Beach home. Your new balance is: " + money);
        }if (choice1 == 5)
        {money = money - 175000;
            housing.equals("Farmhouse");
            System.out.println("Congrats! You purchased the Farmhouse. Your new balance is: " + money);
        }if (choice1 == 6)
        {
            money = money - 300000;
            housing.equals("Mansion");
            System.out.println("Congrats! You purchased the Mansion. Your new balance is: " + money);
        }
    }
    String pets = "";

    public void pets()
    {
        int ran = r.nextInt(5);
        if(ran == 0)
        {
            pets = pets + "Dog ";
            System.out.println("Surprise! You adopted a dog! YAY!");
        }
        if(ran == 1)
        {
            pets = pets + "Cat ";
            System.out.println("Surprise! You adopted a cat! YAY!");
        }if(ran == 2)
        {
            pets = pets + "Bunny ";
            System.out.println("Surprise! You adopted a bunny! YAY!");
        }if(ran == 3)
        {
            pets = pets + "Hamster ";
            System.out.println("Surprise! You adopted a hamster! YAY!");
        }if(ran == 4)
        {
            pets = pets + "Horse ";
            System.out.println("Surprise! You adopted a horse! YAY!");
        }if(ran == 5)
        {
            pets = pets + "Gecko ";
            System.out.println("Surprise! You adopted a gecko! YAY!");
        }
    }

    public int College()
    {
        //need to add 4 to age if college 
        System.out.println("You have completed college. You have $250,000 in loans.");
        System.out.println("Now it's time to pick a career.");
        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound); 
        //String job = "";

        if (int_random == 1)
        {
            System.out.println("You are a doctor. Your salary is $200,000 per year.");
            salary = 200000;
            job = "Doctor";

        }
        if (int_random == 2)
        {
            System.out.println("You are a lawyer. Your salary is $150,000 per year.");
            salary = 150000;
            job = "Lawyer";
        }
        if (int_random == 3)
        {
            System.out.println("You are a data scientist. Your salary is $100,000 per year.");
            salary = 100000;
            job = "Data scientist";
        }
        if (int_random == 4)
        {
            System.out.println("You are a biologist. Your salary is $90,000 per year.");
            salary = 90000;
            job = "Biologist";
        }
        if (int_random == 5)
        {
            System.out.println("You are a biomedical engineer. Your salary is $80,000 per year.");
            salary = 80000;
            job = "Biomedical engineer";
        }
        if (int_random == 6)
        {
            System.out.println("You are a pharmacist. Your salary is $110,000.");
            salary = 110000;
            job = "Pharmacist";
        }
        return int_random;
    }

    public int Career()
    {
        System.out.println("You have chosen the career path.");
        System.out.println("Now it's time to pick a career.");
        Random rand1 = new Random();
        int upperbound = 7;
        int int_random1 = rand1.nextInt(upperbound); 

        if (int_random1 == 1)
        {
            System.out.println("You are an Actor. Your salary is $50,000 per year.");
            salary = 50000;
            job = "Actor";
        }
        if (int_random1 == 2)
        {
            System.out.println("You are a Nursing Assistant. Your salary is $25,000 per year.");
            salary = 25000;
            job = "Nursing Assistant";
        }
        if (int_random1 == 3)
        {
            System.out.println("You are a Waitress. Your salary is $40,000 per year.");
            salary = 40000;
            job = "Waitress";
        }
        if (int_random1 == 4)
        {
            System.out.println("You are a Bartender. Your salary is $30,000 per year.");
            salary = 30000;
            job = "Bartender";
        }
        if (int_random1 == 5)
        {
            System.out.println("You are a Phlebotomist. Your salary is $60,000 per year.");
            salary = 60000;
            job = "Phlebotomist";
        }
        if (int_random1 == 6)
        {
            System.out.println("You are a Singer. Your salary is $55,000.");
            salary = 55000;
            job = "Singer";
        }
        return int_random1;
    }

    public int Kid(){
        System.out.println("You have chosen to have kids. Good choice?");

        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound); 

        // kid = kid+1...

        if (int_random == 1 || int_random ==2)
        {
            System.out.println("You have one kid.");
            kid = kid +1;
            money = money - 10000;
            System.out.println("Kids are expensive :( Your new balance is: " + money);

        }

        if (int_random == 3 || int_random == 4)
        {
            System.out.println("You have two kids.");
            kid = kid +2;
            money = money - 20000;
            System.out.println("Kids are expensive :( Your new balance is: " + money);
        }
        if (int_random == 5 || int_random ==6)
        {
            System.out.println("You have three kids.");
            kid = kid+3;
            money = money - 30000;
            System.out.println("Kids are expensive :( Your new balance is: " + money);
        }

        return int_random;
    }

    public void lifeEvents()
    {
        int ran1 = r2.nextInt(50);
        if(ran1 >= 0 && ran1 <=14)
        {
            System.out.println("------------------------");
            System.out.println("Lucky you! You found $100 in your pocket!");
            money = money + 100;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
        if(ran1 >14 && ran1 <= 20)
        {
            System.out.println("------------------------");
            System.out.println("Oh no! You got into a car accident and it was your fault. You owe $3500 for damage. :(");
            money = money - 3500;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
        if(ran1 > 20 && ran1 <=34)
        {
            System.out.println("------------------------");
            System.out.println("Grocery time! You spent $337 on groceries.");
            money = money - 337;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
        if(ran1 >34 && ran1 <= 35)
        {
            System.out.println("------------------------");
            System.out.println("Your house got robbed. All valuables were stolen. You lost $50,000 in value.");
            money = money - 50000;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
        if(ran1 > 35 && ran1 <= 36)
        {
            System.out.println("------------------------");
            System.out.println("WOW! YOU WON THE LOTTERY! YOU GOT $100,000!!!");
            money = money + 100000;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
        if(ran1 >36 && ran1 <= 49)
        {
            System.out.println("------------------------");
            System.out.println("Bills are due. Pay $1550.");
            money = money - 1550;
            System.out.println("New money value: " + money);
            System.out.println("------------------------");
        }
    }

    public void rolldice()
    {
        int ran3 = r3.nextInt(41);
        if(ran3 >= 0 && ran3 <=9)
        {
            money = money + salary;
            System.out.println("It's payday! Earn: " + salary);
        }
        if(ran3 >10 && ran3 <= 34)
        {
            lifeEvents();

        }
        if(ran3 >34 && ran3 <= 35)
        {
            Kid();

        }

        if(ran3 > 35 && ran3 <= 40)
        {
            pets();

        }

    }

    public void retirement()
    {
        System.out.println("You made it through life. Your ending savings was $" + money);
        System.out.println("Thanks for playing!");
    }

    public void choiceBoard(int age)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are now " + age + " years old");
        System.out.println("What would you like to do?");
        System.out.println("1) Continue");
        System.out.println("2) Stats");
        System.out.println("3) Die");
        int choice = sc.nextInt();
        //extraneous exxx = new extraneous();
        if(choice == 1)
        {
            turn();
        }
        else if(choice == 2)
        {
            stats();
            choiceBoard(age);
        }
        else if(choice == 3)
        {
            death();
        }
    }

    public void turn()
    {

        Scanner sc2 = new Scanner(System.in);
        //career ca = new career();
        //college co = new college();
        //extraneous exx = new extraneous();
        //kidgenerator k = new kidgenerator();
        //rolldice

        if(age == 18)
        {
            System.out.println("Would you like to go to college? Note: There is a $250,000 loan (Enter - y/n)");
            String col = sc2.nextLine();
            if(col.equals("y"))
            {
                System.out.println("You have chosen college. Here's to the next 4 years! Hopefully it's worth it...");
                money = money - 250000;
                college = true;

            }
            if(col.equals("n"))
            {
                Career();
            } 
        }
        else if(age == 22)
        {
            if(college == true)
            {
                //System.out.println("You have completed college.");
                College();
            }
            System.out.println("Would you like to get married? Enter 1 for yes or 2 for no");

            marriage();

        }
        else if(age== 26)
        {
            housing();
        }
        else if(age == 30)
        {
            System.out.println("Do you want children? (y/n)");
            String kid2 = sc2.nextLine();
            if(kid2.equals("y"))
            {

                Kid();

            }
        }

        else if(age == 70)
        {
            retirement();
            //stop the game

        }

        age = age + 2;
        if(age <=70)
        {
            rolldice();
            choiceBoard(age);

        }
    }

    public void stats()
    {
        System.out.println("Name: " + name);

        System.out.println("Age: " + age);

        System.out.println("Occupation: " + job);

        System.out.println("Money: " + money);

        System.out.println("Kids: " + kid);

        System.out.println("Pets: " + pets);

        if(marriage == true)
        {
            System.out.println("Marriage Status: Married");

        }
        if(marriage == false)
        {
            System.out.println("Marriage Status: Single");
        }
        System.out.println(housing);

    }

    public void death()
    {
        System.out.println("you died. rip ");

    }

    //for stats make sure it shows their
    //Name: ___ 
    //Age:
    //Occupation:
    //Money:
    //Kids:
    //Pets:

}
