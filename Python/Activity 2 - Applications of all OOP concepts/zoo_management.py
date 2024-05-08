from abc import ABC, abstractmethod

# Abstract base class for all animals
class Animal(ABC):
    def __init__(self, name, age):
        # Initialize common attributes for all animals
        self._name = name
        self._age = age

    # Abstract method to be implemented by subclasses
    @abstractmethod
    def make_sound(self):
        pass

    # Method to get the name of the animal
    def get_name(self):
        return self._name

    # Method to get the age of the animal
    def get_age(self):
        return self._age

# Lion class inherits from Animal
class Lion(Animal):
    def __init__(self, name, age, mane_color):
        # Call the base class constructor and initialize Lion-specific attribute
        super().__init__(name, age)
        self._mane_color = mane_color

    # Override make_sound method for Lion
    def make_sound(self):
        return "Roar"

    # Method to get the mane color of the Lion
    def get_mane_color(self):
        return self._mane_color

# Elephant class inherits from Animal
class Elephant(Animal):
    def __init__(self, name, age, tusk_length):
        # Call the base class constructor and initialize Elephant-specific attribute
        super().__init__(name, age)
        self._tusk_length = tusk_length

    # Override make_sound method for Elephant
    def make_sound(self):
        return "Trumpet"

    # Method to get the tusk length of the Elephant
    def get_tusk_length(self):
        return self._tusk_length

# Bird class inherits from Animal
class Bird(Animal):
    def __init__(self, name, age, wing_span):
        # Call the base class constructor and initialize Bird-specific attribute
        super().__init__(name, age)
        self._wing_span = wing_span

    # Override make_sound method for Bird
    def make_sound(self):
        return "Chirp"

    # Method to get the wing span of the Bird
    def get_wing_span(self):
        return self._wing_span

# Zoo class to manage animals
class Zoo:
    def __init__(self):
        # Initialize an empty list of animals
        self._animals = []

    # Method to add an animal to the zoo
    def add_animal(self, animal):
        self._animals.append(animal)

    # Method to remove an animal from the zoo by name
    def remove_animal(self, name):
        self._animals = [animal for animal in self._animals if animal.get_name() != name]

    # Method to display all animals in the zoo
    def display_animals(self):
        for animal in self._animals:
            print(f"Name: {animal.get_name()}, Age: {animal.get_age()}, Sound: {animal.make_sound()}")
            if isinstance(animal, Lion):
                print(f"Mane Color: {animal.get_mane_color()}")
            elif isinstance(animal, Elephant):
                print(f"Tusk Length: {animal.get_tusk_length()}")
            elif isinstance(animal, Bird):
                print(f"Wing Span: {animal.get_wing_span()}")


if __name__ == "__main__":
    
    # Create an instance of the Zoo class
    zoo = Zoo()

    while True:
        print("\n1. Add an animal to the zoo")
        print("2. Remove an animal from the zoo")
        print("3. Display all animals in the zoo")
        print("4. Exit")

        choice = input("\nEnter your choice: ")

        if choice == '1':
            animal_type = input("\nEnter the type of the animal (Lion, Elephant, Bird): ")
            name = input("Enter the name of the animal: ")
            age = int(input("Enter the age of the animal: "))

            if animal_type.lower() == 'lion':
                mane_color = input("Enter the mane color of the lion: ")
                zoo.add_animal(Lion(name, age, mane_color))
            elif animal_type.lower() == 'elephant':
                tusk_length = int(input("Enter the tusk length of the elephant: "))
                zoo.add_animal(Elephant(name, age, tusk_length))
            elif animal_type.lower() == 'bird':
                wing_span = int(input("Enter the wing span of the bird: "))
                zoo.add_animal(Bird(name, age, wing_span))
            else:
                print("Invalid animal type")

        elif choice == '2':
            name = input("\nEnter the name of the animal to remove: ")
            zoo.remove_animal(name)

        elif choice == '3':
            print("\nAll animals in the zoo: ")
            zoo.display_animals()

        elif choice == '4':
            break

        else:
            print("Invalid choice. Please enter a number between 1 and 4.")
