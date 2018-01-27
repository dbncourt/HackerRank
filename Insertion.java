    static Node Insert(Node root,int value) {
        if (root == null) {
          root = node(value);
        } else {
          for (Node scout = root; ; ) {
            if (value < scout.data) {
              if (scout.left != null) {
                scout = scout.left;
              } else {
                scout.left = node(value);
                break;
              }
            } else if (value > scout.data) {
              if (scout.right != null) {
                scout = scout.right;
              } else {
                scout.right = node(value);
                break;
              }
            } else {
                break;
            }
          }
        }
        return root;
    }

    static Node node(int value){
        Node node = new Node();
        node.data = value;
        
        return node;
    }
