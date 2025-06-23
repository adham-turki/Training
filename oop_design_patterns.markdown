# Object-Oriented Programming (OOP) and Design Patterns for Frontend Interviews

This guide summarizes key OOP concepts, design patterns, and React-specific topics for preparing for a frontend developer interview. It is tailored for fresh candidates, covering polymorphism, constructors/destructors, abstract classes vs. interfaces, SOLID principles, React hooks, React Query, Redux, and design patterns like Factory and Singleton. Each section includes clear explanations, Java examples, and practical use cases to help you understand and prepare effectively.

---

## Table of Contents
1. [OOP Principles](#oop-principles)
   - [Polymorphism](#polymorphism)
   - [Encapsulation](#encapsulation)
   - [Abstraction](#abstraction)
   - [Inheritance](#inheritance)
   - [Constructors and Destructors](#constructors-and-destructors)
   - [Abstract Class vs. Interface](#abstract-class-vs-interface)
2. [SOLID Principles](#solid-principles)
3. [React Hooks](#react-hooks)
4. [React Query](#react-query)
5. [Redux](#redux)
6. [Design Patterns](#design-patterns)
   - [Factory Pattern](#factory-pattern)
   - [Singleton Pattern](#singleton-pattern)
7. [Preparation Tips](#preparation-tips)

---

## OOP Principles

### Polymorphism
**What is it?**  
Polymorphism ("many forms") allows objects of different classes to be treated as objects of a common superclass. The same method can behave differently based on the object calling it.

**Types**:
- **Compile-time (Static)**: Achieved via **method overloading** or **operator overloading**. Resolved at compile time.
- **Runtime (Dynamic)**: Achieved via **method overriding**. Resolved at runtime based on the actual object type.

**Example (Runtime Polymorphism in Java)**:
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound(); // Output: Dog barks
        a = new Cat();
        a.sound(); // Output: Cat meows
    }
}
```

**Why Asked?** Tests understanding of flexible and reusable code.

**Analogy**: A remote control with a "play" button works differently for a TV (shows video) or a radio (plays sound), but the button is the same.

### Encapsulation
**What is it?**  
Encapsulation bundles data (variables) and methods into a class, restricting direct access to protect data integrity.

**Example (Java)**:
```java
class BankAccount {
    private double balance;
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
```

**Why Asked?** Tests knowledge of data protection and modularity.

### Abstraction
**What is it?**  
Abstraction hides complex implementation details and exposes only essential features.

**Example (Java)**:
```java
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}
```

**Why Asked?** Tests understanding of simplifying complex systems.

### Inheritance
**What is it?**  
Inheritance allows a class to inherit fields and methods from another class for code reuse.

**Example (Java)**:
```java
class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}
class Car extends Vehicle {
    void playMusic() {
        System.out.println("Playing music");
    }
}
```

**Why Asked?** Tests knowledge of code reuse and hierarchy.

### Constructors and Destructors
**What are they?**  
- **Constructor**: A special method called when an object is created to initialize it. Same name as the class, no return type.
- **Destructor**: Not used in Java (handled by garbage collection). In languages like C++, it’s a method (prefixed with `~`) called when an object is destroyed to clean up resources.

**Example (Constructor in Java)**:
```java
class Person {
    String name;
    Person(String personName) {
        name = personName;
        System.out.println("Constructor called. Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Adham"); // Output: Constructor called. Name: Adham
    }
}
```

**Example (Destructor in C++ for comparison)**:
```cpp
class Person {
public:
    Person() { cout << "Constructor called" << endl; }
    ~Person() { cout << "Destructor called" << endl; }
};
int main() {
    Person p; // Constructor called, then Destructor called at end of scope
}
```

**Why Asked?** Tests understanding of object lifecycle management.

### Abstract Class vs. Interface
**What are they?**  
- **Abstract Class**: A class with some implementation (methods/variables) and abstract methods. Used for shared behavior.
- **Interface**: A contract with method declarations (no implementation, except default methods in Java 8+). Used for enforcing behavior across unrelated classes.

**Comparison**:
| Feature                | Abstract Class                     | Interface                          |
|------------------------|------------------------------------|------------------------------------|
| **Keyword**            | `abstract class`                  | `interface`                       |
| **Method Bodies**      | Can have concrete/abstract methods | Only abstract (or default) methods |
| **Variables**          | Instance variables allowed        | Only constants (`static final`)   |
| **Inheritance**        | Single inheritance                | Multiple interfaces               |
| **Constructor**        | Yes                               | No                                |
| **Use Case**           | Shared code + enforced methods    | Contract for unrelated classes    |

**Example (Abstract Class)**:
```java
abstract class Vehicle {
    abstract void start();
    void fuelUp() {
        System.out.println("Fueling up...");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }
}
```

**Example (Interface)**:
```java
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() {
        System.out.println("Flying in the sky");
    }
}
```

**Why Asked?** Tests ability to choose the right abstraction for a problem.

---

## SOLID Principles
SOLID principles ensure clean, maintainable, and scalable code.

### 1. Single Responsibility Principle (SRP)
**What is it?** A class should have only one reason to change (one responsibility).

**Example (Java)**:
```java
class OrderTaker {
    public void takeOrder() {
        System.out.println("Taking customer order...");
    }
}
class Chef {
    public void cookOrder() {
        System.out.println("Cooking the order...");
    }
}
```

**Why Asked?** Tests modular design understanding.

### 2. Open/Closed Principle (OCP)
**What is it?** Classes should be open for extension but closed for modification.

**Example (Java)**:
```java
abstract class Dish {
    abstract void cook();
}
class Pasta extends Dish {
    public void cook() {
        System.out.println("Cooking pasta...");
    }
}
class Kitchen {
    public void prepareDish(Dish dish) {
        dish.cook();
    }
}
```

**Why Asked?** Tests ability to design extensible systems.

### 3. Liskov Substitution Principle (LSP)
**What is it?** Subclasses should be substitutable for their base class without breaking behavior.

**Example (Java)**:
```java
interface Bird {
    void layEggs();
}
interface FlyingBird extends Bird {
    void fly();
}
class Eagle implements FlyingBird {
    public void layEggs() { System.out.println("Eagle lays eggs."); }
    public void fly() { System.out.println("Eagle flies."); }
}
```

**Why Asked?** Tests proper inheritance design.

### 4. Interface Segregation Principle (ISP)
**What is it?** Classes shouldn’t be forced to implement methods they don’t use.

**Example (Java)**:
```java
interface Toaster {
    void toast();
}
class SimpleToaster implements Toaster {
    public void toast() {
        System.out.println("Toasting bread...");
    }
}
```

**Why Asked?** Tests clean interface design.

### 5. Dependency Inversion Principle (DIP)
**What is it?** Depend on abstractions, not concrete implementations.

**Example (Java)**:
```java
interface Database {
    void connect();
}
class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }
}
class OrderService {
    private Database db;
    public OrderService(Database db) {
        this.db = db;
    }
}
```

**Why Asked?** Tests decoupled system design.

---

## React Hooks
**What are they?** Functions that let functional components use React features like state and lifecycle.

### Key Hooks with Examples
1. **useState**: Store and update local state.
   - **When to use**: For counters, form inputs, or toggles.
   ```jsx
   import { useState } from 'react';
   function Counter() {
       const [count, setCount] = useState(0);
       return <button onClick={() => setCount(count + 1)}>{count}</button>;
   }
   ```

2. **useEffect**: Handle side effects (e.g., API calls, timers).
   - **When to use**: Fetch data or set up subscriptions.
   ```jsx
   import { useEffect, useState } from 'react';
   function UserProfile({ userId }) {
       const [user, setUser] = useState(null);
       useEffect(() => {
           fetch(`/api/users/${userId}`)
               .then(res => res.json())
               .then(data => setUser(data));
       }, [userId]);
       return <div>{user ? user.name : 'Loading...'}</div>;
   }
   ```

3. **useContext**: Access global data without prop drilling.
   - **When to use**: For themes, user data, or language settings.
   ```jsx
   import { useContext } from 'react';
   import { ThemeContext } from './ThemeContext';
   function Header() {
       const theme = useContext(ThemeContext);
       return <h1 style={{ color: theme.text }}>Welcome!</h1>;
   }
   ```

4. **useRef**: Store a value without triggering re-renders or access DOM elements.
   - **When to use**: Focus inputs or store timer IDs.
   ```jsx
   import { useRef, useEffect } from 'react';
   function FocusInput() {
       const inputRef = useRef();
       useEffect(() => {
           inputRef.current.focus();
       }, []);
       return <input ref={inputRef} />;
   }
   ```

5. **useMemo**: Cache expensive calculations.
   - **When to use**: For performance optimization of heavy computations.
   ```jsx
   import { useMemo } from 'react';
   function ExpensiveCalc({ number }) {
       const result = useMemo(() => heavyCalculation(number), [number]);
       return <div>{result}</div>;
   }
   ```

6. **useCallback**: Cache functions to prevent recreation.
   - **When to use**: Pass stable functions to child components.
   ```jsx
   import { useCallback, useState } from 'react';
   function Parent() {
       const [count, setCount] = useState(0);
       const handleClick = useCallback(() => setCount(c => c + 1), []);
       return <Child onClick={handleClick} />;
   }
   ```

7. **useReducer**: Manage complex state logic.
   - **When to use**: For forms or multi-step state changes.
   ```jsx
   import { useReducer } from 'react';
   function reducer(state, action) {
       switch (action.type) {
           case 'increment': return { count: state.count + 1 };
           default: return state;
       }
   }
   function Counter() {
       const [state, dispatch] = useReducer(reducer, { count: 0 });
       return <button onClick={() => dispatch({ type: 'increment' })}>{state.count}</button>;
   }
   ```

**Why Asked?** Tests modern React development skills.

---

## React Query
**What is it?** A library for managing server state (API data) with built-in caching, refetching, and error handling.

**Why Use?** Simplifies fetching, caching, and updating data compared to manual `useEffect` setups.

**Key Features**:
- **useQuery**: Fetch and cache data (GET requests).
- **useMutation**: Create/update/delete data (POST, PUT, DELETE).
- **QueryClient**: Manages caching and refetching.

**Example (useQuery)**:
```jsx
import { useQuery } from '@tanstack/react-query';
function Users() {
    const { data, isLoading, error } = useQuery({
        queryKey: ['users'],
        queryFn: () => fetch('/api/users').then(res => res.json())
    });
    if (isLoading) return <p>Loading...</p>;
    if (error) return <p>Error loading users</p>;
    return <ul>{data.map(user => <li key={user.id}>{user.name}</li>)}</ul>;
}
```

**Example (useMutation)**:
```jsx
import { useMutation, useQueryClient } from '@tanstack/react-query';
function AddUser() {
    const queryClient = useQueryClient();
    const mutation = useMutation({
        mutationFn: newUser => fetch('/api/users', {
            method: 'POST',
            body: JSON.stringify(newUser),
            headers: { 'Content-Type': 'application/json' }
        }),
        onSuccess: () => queryClient.invalidateQueries({ queryKey: ['users'] })
    });
    return <button onClick={() => mutation.mutate({ name: 'John' })}>Add User</button>;
}
```

**useQuery vs. useMutation**:
| Feature           | useQuery                       | useMutation                     |
|-------------------|--------------------------------|---------------------------------|
| **Use Case**      | Fetch data (GET)              | Modify data (POST, PUT, DELETE) |
| **Auto Run**      | Yes (on mount)                | No (manual `.mutate()`)         |
| **Caching**       | Yes                           | No (but can invalidate caches)  |
| **Example**       | Load user list                | Add new user                    |

**Why Asked?** Tests knowledge of modern state management for APIs.

---

## Redux
**What is it?** A state management library for centralized client-side state in React apps.

**Core Concepts**:
- **Store**: Single source of truth for app state.
- **Action**: Object describing what happened (e.g., `{ type: 'INCREMENT' }`).
- **Reducer**: Pure function updating state based on actions.
- **Dispatch**: Sends actions to the reducer.
- **Selector**: Reads state values.

**Example (Redux Toolkit)**:
```javascript
// store.js
import { configureStore, createSlice } from '@reduxjs/toolkit';
const counterSlice = createSlice({
    name: 'counter',
    initialState: { value: 0 },
    reducers: {
        increment: state => { state.value += 1; }
    }
});
export const { increment } = counterSlice.actions;
export const store = configureStore({ reducer: { counter: counterSlice.reducer } });
```

```jsx
// App.js
import { useSelector, useDispatch } from 'react-redux';
import { increment } from './store';
function App() {
    const count = useSelector(state => state.counter.value);
    const dispatch = useDispatch();
    return <button onClick={() => dispatch(increment())}>{count}</button>;
}
```

**Why Asked?** Tests understanding of centralized state management.

---

## Design Patterns

### Factory Pattern
**What is it?** A creational pattern that hides object creation logic and returns objects of a common type.

**Example (Java)**:
```java
interface Vehicle {
    void start();
}
class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting...");
    }
}
class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) return new Car();
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.start(); // Output: Car starting...
    }
}
```

**Why Interface?** Interfaces are preferred for flexibility, but abstract classes can be used if shared behavior is needed.

**Why Asked?** Tests creational design knowledge.

### Singleton Pattern
**What is it?** Ensures a class has only one instance and provides global access to it.

**Example (Java)**:
```java
public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton created");
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**Why Asked?** Tests understanding of resource management and global state.

---

## Preparation Tips
- **Practice Coding**: Implement OOP concepts (e.g., polymorphism, SOLID) in Java or JavaScript on platforms like LeetCode.
- **Build Projects**: Create React apps using hooks, React Query, or Redux (e.g., a to-do app with API integration).
- **Understand Your Code**: Be ready to explain design choices in your projects.
- **Learn Design Patterns**: Practice Factory and Singleton in real-world scenarios.
- **Mock Interviews**: Simulate technical questions with tools like Pramp.
- **Ask Questions**: Inquire about the company’s tech stack or learning opportunities.

---

This markdown file is ready for your GitHub repository. Save it as `oop_design_patterns.md` and push it to your repo for easy reference.