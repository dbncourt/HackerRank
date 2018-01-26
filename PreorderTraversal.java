void preOrder(Node root) {
    preOrderTraverse(root);
}

void preOrderTraverse(Node node){
    if(node != null){
        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }
}
