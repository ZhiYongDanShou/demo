package lab07;

import java.sql.Date;

/**
 * @author shkstart
 * @create 2021-10-11 {TIME}
 */
class Person {
    private Date birthDate;
    private static Date startDate,endDate;

        static {

             startDate = Date.valueOf("1940-1-1");
             endDate = Date.valueOf("1964-1-1");
        }

    public Person(Date birthDate){
        this.birthDate = birthDate;
    }

    boolean isBornBoomer(){
        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate)<0;
    }

    public static void main(String[] args) {
            Date date = Date.valueOf("1950-1-1");
            Person person = new Person(date);
        System.out.println(person.isBornBoomer());

    }
}
