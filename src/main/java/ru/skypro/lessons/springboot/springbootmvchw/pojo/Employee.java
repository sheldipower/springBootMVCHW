package ru.skypro.lessons.springboot.springbootmvchw.pojo;
public class Employee {
    public class Employee {
        private static int idGenerator = 1;
        private int id;

        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.id = idGenerator++;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }
    }
}