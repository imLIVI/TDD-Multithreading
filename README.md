# TDD
## TDD-Multithreading
### Description
It is necessary to develop a minimal program using this approach. You need to develop a phonebook class that allows you to:
* ```add``` - add a name with a number. The method should return the number of contacts after adding, and it is guaranteed that duplicate names will not be added;
* ```findByNumber``` - find a name by number without a full search;
* ```findByName``` - find a number by name without a full search;
* ```printAllNames``` - print all names in alphabetical order without having to sort.

### Realization
The phonebook class should be developed in stages, one method at a time. TDD techniques should be followed. Thus, the development should follow the following points:
1. Create an empty maven project;
2. Create an empty ```PhoneBook``` class;
3. Create an empty ```PhoneBookTest``` test class;
4. Make a commit with the ```Initial commit message```;
5. Create an empty ```add``` stub method in the ```PhoneBook``` class, which simply returns ```false```;
6. Create test(s) for the ```add``` method in the ```PhoneBookTest``` test class;
7. Make sure that everything compiles and tests don't pass. Make a commit with the message ```Stub and tests for add```;
8. Implement the ```add``` method so that all tests pass;
9. Make a commit with the message ```add implemented```;
10. Create an empty ```findByNumber``` stub method in the ```PhoneBook``` class that simply returns ```null```;
11. Create a test(s) for the ```findByNumber``` method in the ```PhoneBookTest``` test class;
12. Make sure everything compiles and tests fail. Make a commit with the message ```Stub and tests for findByNumber```;
13. Implement the ```findByNumber``` method so that all tests pass;
14. Make a commit with the message ```findByNumber implemented```;
15. ...

<a href="https://github.com/netology-code/jd-homeworks/blob/video/tdd_ddd/task1/README.md">(RUS version of description)</a>
