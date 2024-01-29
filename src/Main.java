public class Main {
    public static void main(String[] args)
    {
        //Задание 1
        String firstName="Иван";
        String middleName="Иванович";
        String lastName="Иванов";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("Ф.И.О. сотрудника - "+fullName);

        //Задание 2
        String upperName=fullName.toUpperCase();
        System.out.println("ФДанные Ф. И. О. сотрудника для заполнения отчета — "+upperName);

        //Задание 3
        fullName="Иванов Семён Семёнович";
        char oldChar='ё';
        char newChar='е';
        String korrectName=fullName.replace(oldChar,newChar);
        System.out.println("Данные Ф.И.О. сотрудника - "+korrectName);
    }
}