//Задача 1: Дана строка sql-запроса "select * from students where ". 
//Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task1 {
    public static void main(String[] args) {
        String request = "select * from students WHERE";
        String name = "Ivanov";
        String country = "Russia";
        String city = "Moscow";
        String age = "null";
        String and = "AND";
        StringBuilder sb = new StringBuilder();
        sb.append(request).append(" ");
        if (!name.equalsIgnoreCase("null")) {
            sb.append(name).append(" ");
        }
        if (!country.equalsIgnoreCase("null")) {
            sb.append(and).append(" ");
            sb.append(country).append(" ");
        }
        if (!city.equalsIgnoreCase("null")) {
            sb.append(and).append(" ");
            sb.append(city).append(" ");
        }
        if (!age.equalsIgnoreCase("null")) {
            sb.append(and).append(" ");
            sb.append(age).append(" ");
        }
        System.out.println(sb.toString());        
    }
    
}



// StringBuilder result = new StringBuilder();
//         String[] words = text.split(" ");
//         for (String word : words) {
//             result.append(reverseWord(word)).append(" ");
//         }
//         return result.toString();