package javaOdevleri.Employee;

public class Employee {
    String name ;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name ,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours =workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
         if( this.salary<100){
           return 0.0;
         }
         else {
             return (this.salary*0.03);
         }

    }
    public double bonus(){
        if(this.hireYear<=40){
            return 0;
        }
        else {
            return (this.workHours-40)  * 30;
        }

    }
    public double raiseSalary(){
        if(this.hireYear<10){
            return (this.salary * 0.05);
        } else if (this.hireYear>9 && this.hireYear<20) {
            return (this.salary * 0.10);
        }
        else{
            return (this.salary * 0.15);
        }
    }

    public void tostring(){
        System.out.println("Adı: "+this.name);
        System.out.println("Calışma Saati: "+this.workHours);
        System.out.println("Başlangıç Yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Extrası: "+raiseSalary());
        this.salary += (bonus() - tax() +raiseSalary());
        System.out.println("Maaşı: "+this.salary);

    }

}

/*
* Adı : kemal
Maaşı : 2000.0
Çalışma Saati : 45
Başlangıç Yılı : 1985
Vergi : 60.0
Bonus : 150.0
Maaş Artışı : 300.0
Vergi ve Bonuslar ile birlikte maaş : 2090.0
Toplam Maaş : 2300.0*/
