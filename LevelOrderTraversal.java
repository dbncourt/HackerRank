   void levelOrder(Node root) {
        if(root != null){
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);            
            for(Node n = queue.poll(); n != null; n = queue.poll()){
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
                System.out.print(n.data + " ");
            }
        }
    }
