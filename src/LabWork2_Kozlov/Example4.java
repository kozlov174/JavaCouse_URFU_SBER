package LabWork2_Kozlov;

class Person{
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
//В данной реализации не учитывается много нюансов. Например, у нас возраст может быть отрицательный
// и больше возможного срока жизни человека. Подобные проверки можно добавить в setAge()