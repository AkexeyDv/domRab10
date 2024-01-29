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
        char oldCharBig='Ё';
        char newCharBig='Е';
        String korrectName=fullName.replace(oldChar,newChar);
        /*На случай, если ФИО большими буквами. Память это не займет, ведь хранится только
        один экземпляр строки*/
        korrectName=korrectName.replace(oldCharBig,newCharBig);
        System.out.println("Данные Ф.И.О. сотрудника - "+korrectName);
    }
}