/*You are developing a program for a grading system. Given a list of students with their marks,
 implement a control structure to categorize them into different grade brackets (A, B, C, D, F) */
 class Students {
    int roll;
    String name;
    Marks m;

    Students(int roll, String name, Marks m) {
        this.roll = roll;
        this.name = name;
        this.m = m;
        System.out.println("Roll: " + roll + ", Name: " + name + ", Marks: " + m.sub1 + " " + m.sub2 + " " + m.sub3);
    }
}

class Marks {
    int sub1;
    int sub2;
    int sub3;

    Marks(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }
}

class Grade {
    int total; // out of 100
    Grade(){
        System.out.println("grades:");
    }

    int calGrade(Marks mark) {
        total = (mark.sub1 + mark.sub2 + mark.sub3) / 3;
        return total;
    }

    public static void main(String args[]) {
        Marks m = new Marks(90, 80, 60);
        Students s = new Students(001, "muskan", m);
        Grade g = new Grade();
        g.calGrade(m);
        
        if (g.total > 90) {
            System.out.println("A");
        } else if (g.total > 80 && g.total <= 90) {
            System.out.println("B");
        } else if (g.total > 70 && g.total <= 80) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
