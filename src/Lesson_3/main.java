package Lesson_3;

public class main {
    public static void main(String[] args) {
        employee[] team = new employee[5];

        team[0] = new employee("Ivanov Sergei Georgievich","engineer","+78953248901",50500, 34);
        team[1] = new employee("Petrov Ivan Ivanovich","designer","+78953248902",45000, 26);
        team[2] = new employee("Karenina Anna Nicolaevna","manager","+78953248903",60000, 41);
        team[3] = new employee("Fedosov Denis Andreevich","programmer","+78953248904",89000, 46);
        team[4] = new employee("Forostovskaya Ksenia Victorovna","tester","+78953248905",67500, 34);


        for(int i = 0; i < team.length;i++) {
            System.out.println("ФИО: " + team[i].getName() + " с должностью " + team[i].getPosition());
        }
        for ( int i = 0; i < team.length; i++) {
            if (team[i].getAge() > 40) {
                System.out.println( team[i].getName() + " "+  team[i].getPosition() + " " + team[i].getPhoneNumber()  + " " + team[i].getSalary() + " " + team[i].getAge());
            }
        }



    }
}
