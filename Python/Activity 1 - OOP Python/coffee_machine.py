class Coffee:
    def __init__(self, name, base_price):
        self.name = name
        self.base_price = base_price

class Option:
    def __init__(self, name, price):
        self.name = name
        self.price = price

class UserProfile:
    def __init__(self, name, preferred_coffee, balance):
        self.name = name
        self.preferred_coffee = preferred_coffee
        self.preferred_options = []
        self.balance = balance 

    def add_option(self, option):
        self.preferred_options.append(option)

class CoffeeMachine:
    def __init__(self):
        self.coffees = []
        self.options = []
        self.current_user = None

    def add_coffee(self, coffee):
        self.coffees.append(coffee)

    def add_option(self, option):
        self.options.append(option)

    def login(self, user_name):
        for user in [user1, user2]:
            if user.name == user_name:
                self.current_user = user
                print(f"{user_name} logged in")
                return
        print("User not found.")

    def get_coffee_price(self, coffee_name, options=[]):
        coffee = next((c for c in self.coffees if c.name == coffee_name), None)
        total_price = coffee.base_price
        for option_name in options:
            option = next((o for o in self.options if o.name == option_name), None)
            if option:
                total_price += option.price
        return total_price

    def purchase_coffee(self, coffee_name, options=[]):
        if not self.current_user:
            print("Please login first")
            return
        price = self.get_coffee_price(coffee_name, options)
        if price:
            if self.current_user.balance >= price: 
                print(f"Total Price: {price}")
                self.current_user.balance -= price  
                print(f"Coffee {coffee_name} with {options}")
                print(f"{self.current_user.name}'s remaining balance: {self.current_user.balance} \n") 
            else:
                print("Insufficient funds")

# Create coffee machine
machine = CoffeeMachine()

# Add coffees 
machine.add_coffee(Coffee("Espresso", 1.50))
machine.add_coffee(Coffee("Latte", 2.00))

# Add options
machine.add_option(Option("Milk", 0.50))
machine.add_option(Option("Sugar", 0.25))

# Create user profiles with initial balance
user1 = UserProfile("John", machine.coffees[0], 10.00)  # Prefers Espresso
user1.add_option(machine.options[0])  # John likes milk in his coffee

user2 = UserProfile("Jane", machine.coffees[1], 2.00)  # Prefers Latte
user2.add_option(machine.options[1])  # Jane likes sugar


# Users login
machine.login("John")
# John purchases coffee
machine.purchase_coffee("Espresso", ["Milk"])  # Espresso with milk

machine.login("Jane")
# Jane purchases coffee
machine.purchase_coffee("Latte", ["Sugar"])  # Latte with sugar