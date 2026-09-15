import java.util.ArrayList;
import java.util.List;

public class Node {
    public String label;
    public Node parent;
    public List<Node> children;

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<>();
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

    // height(노드높이) 함수(메서드) 추가
    public int height() {
        if (children.isEmpty()) {
            return 0;
        }

        int maxHeight = 0;

        for (Node child : children) {
            int childHeight = child.height();

            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }

        return maxHeight + 1;
    }

  
    // hasChild (자식노드 존재 확인) 함수(메서드) 추가
    public boolean hasChild() {
        return !children.isEmpty();
    }
  

    // DFS (깊이 우선 탐색) 메서드 추가
    public void dfs() {
        // 1. 현재 노드의 라벨(이름)을 출력합니다.
        System.out.print(this.label + " ");

        // 2. 자식 노드들을 순서대로 방문하며 재귀적으로 dfs()를 호출합니다.
        for (Node child : this.children) {
            child.dfs();
        }
    }
}

