from Prod import Prod

class Meals(Prod):
    def __init__(self,name,cost,weight):
        self.__name = name
        self.__cost = cost
        self.__weight = weight

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name
    
    def getCost(self):
        return self.__cost

    def setCost(self, cost):
        self.__cost = cost

    def getWeight(self):
        return self.__weight

    def setWeight(self, weight):
        self.__weight = weight
   
    def __str__(self):
        return f"name:{self.__name} cost:{self.__cost} weight:{self.__weight}"
