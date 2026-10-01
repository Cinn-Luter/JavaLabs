// Чуносов Денис ИТ-1

void main() {
    IO.println("=== Задание 1 ===");

    IO.println("1.3 Имена");
    Name t13a = new Name(null, "Клеопатра", null);
    Name t13b = new Name("Пушкин", "Александр", "Сергеевич");
    Name t13c = new Name("Маяковский", "Владимир", null);
    IO.println(t13a);
    IO.println(t13b);
    IO.println(t13c);
    IO.println();

    IO.println("1.4 Время");
    Time t14a = new Time(10);
    Time t14b = new Time(10000);
    Time t14c = new Time(100000);
    IO.println(t14a.getTotalSeconds() + " сек -> " + t14a);
    IO.println(t14b.getTotalSeconds() + " сек -> " + t14b);
    IO.println(t14c.getTotalSeconds() + " сек -> " + t14c);
    IO.println();

    IO.println("=== Задание 2 ===");

    IO.println("2.4 Сотрудники и отделы");
    Department t24 = new Department("IT");
    Employee t24a = new Employee("Петров", t24);
    Employee t24b = new Employee("Козлов", t24);
    Employee t24c = new Employee("Сидоров", t24);
    t24.setBoss(t24b);
    IO.println(t24a);
    IO.println(t24b);
    IO.println(t24c);
    IO.println(t24);
    IO.println();

    IO.println("=== Задание 3 ===");

    IO.println("3.4 Все сотрудники отдела по ссылке на сотрудника");
    IO.println("Сотрудники отдела, где работает " + t24a.getName() + ":");
    for (Employee e : t24a.getDepartment().getEmployees()) {
        IO.println("- " + e.getName());
    }
    IO.println();

    IO.println("=== Задание 4 ===");

    IO.println("4.4 Создаем Время");
    Time t44a = new Time(10000);
    Time t44b = new Time(2, 3, 5);
    IO.println("Из секунд: " + t44a.getTotalSeconds() + " сек -> " + t44a);
    IO.println("Из часов, минут, секунд: " + t44b + " (внутри " + t44b.getTotalSeconds() + " сек)");
    IO.println();

    IO.println("=== Задание 5 ===");

    IO.println("5.4 Сколько сейчас времени?");
    Time t54a = new Time(34056);
    Time t54b = new Time(4532);
    Time t54c = new Time(123);
    IO.println(t54a.getTotalSeconds() + " сек (" + t54a + ") -> часов: " + t54a.getHours());
    IO.println(t54b.getTotalSeconds() + " сек (" + t54b + ") -> минут: " + t54b.getMinutes());
    IO.println(t54c.getTotalSeconds() + " сек (" + t54c + ") -> секунд: " + t54c.getSeconds());
}
