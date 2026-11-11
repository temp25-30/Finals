class Node():
    def __init__(self,value,left=None,right=None):
        self.value = value
        self.left = left
        self.right = right

nNodes = input("Input number of nodes: ")
nodesArr = []
for i in range(0, nNodes):
    nodesArr[i] = input(f"Node value[{i}]:")

root = Node(10)

root.left = Node(5)     #level 1L
root.right = Node(15)   #level 1R

root.left.left = Node(2)    #level 2L
root.left.right = Node(7)   #level 2L

root.right.left = Node(12)  #level 2R
root.right.right = Node(20) #level 2R

def preorder(root):
    if root is None:
        return []
    return [root.value] + preorder(root.left) + preorder(root.right)
    #return array with root inside
    #recursion call with left side and right side
    #preorder(root.left) and preorder(root.right) returns an array that is combined in with the initial array with root inside
    #example sim
        #preorder(root.left) --> returns [5] + preorder(root.left.left) + preorder(root.left.right) --> [5, 2, 7]
        #preorder(root.right) --> returns [15] + preorder(root.right.left) + preorder(root.right.right) --> [15, 12, 20]

def inOrder(root):
    if root is None:
        return []
    return [root.left.value] + inOrder(root.left) + inOrder(root.right)

def postOrder(root):
    tempRoot = root


def main():
    print("Preorder:",preorder(root))
    print("Inorder:",inOrder(root))
if __name__ == "__main__":
    main()