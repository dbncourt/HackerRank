   public void topView(Node root) {
       if(root != null){
           visitLeftNode(root.left);
           printNode(root);
           visitRightNode(root.right);
       }
    }

    private void visitLeftNode(Node node){
        if(node != null){
            visitLeftNode(node.left);
            printNode(node);
        }
    }

    private void visitRightNode(Node node){
        if(node != null){
            printNode(node);
            visitRightNode(node.right);
        }
    }
    
    private void printNode(Node node){
        System.out.print(node.data + " ");
    }
