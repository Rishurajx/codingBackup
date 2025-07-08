class student:
    def __init__(self,name,phy,chem,math):
        self.name=name
        self.phy=phy
        self.chem=chem
        self.math=math
    def average(self):
        avg=(self.phy+self.chem+self.math)/3
        return avg
class child1:
    a=1
    def __init__(self,name):
        self.name=name
        self.roll=10
class newchild(student,child1):
    def __init__(self,nam):
        self.name=nam
        student.__init__(self,'rishu',99,1,2)
        super.average()