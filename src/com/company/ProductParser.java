package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import javax.swing.text.Element;
import java.io.IOException;

public class ProductParser {
    public static void main(String[] args) throws IOException {
        //Person person = new Person("John", "Doe", "sdf");
        //System.out.println(person.toString());
        Document document = Jsoup.connect("https://calorizator.ru/product/all").get();
        //$x(".//div/div[1]/table[2]/tbody/tr[2]/td[2]/a")[0].childNodes[0]
        Elements elements = document.select("table>tbody>tr");
        System.out.println(elements.size());

        for (Element element:elements) {
            String name=element.select("td>a").text();
            double kcal = 0;
            try{
                kcal = Double.parseDouble(element.select(":eq(5)").text());
            }
            catch (Exception e) {}
            if (!name.isEmpty())
                System.out.println(name+" "+kcal);
        }
    }
}

public class Person {
    private String lastname;
    private String firstname;
    private String patronymic;

    Person(){}

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
    public Person(String lastname, String firstname, String patronymic) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

}


