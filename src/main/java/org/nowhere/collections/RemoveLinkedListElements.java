package org.nowhere.collections;

/**
 * Created by jwang5 on 5/16/2016.
 */
public class RemoveLinkedListElements {

    public ListNode removeList(ListNode head, int val) {
        if (head == null) {
            return head;
        } else {
            if (head.val != val) {
                head.next = removeList(head.next, val);
                return head;
            } else {
                return removeList(head.next, val);
            }
        }

        /*
          if (head == null) {
			return head;
		}
		if(head !=null&&head.next==null){
		    if(head.val==val)
		    head=head.next;
		    return head;
		}
		else {
			ListNode p = head;

			ListNode q;
			while (p != null) {
			if (p.val == val) {
				p = p.next;
				head=p;
			} else if (p.val != val) {

					q = p.next;
					if (q == null) {
					    break;
					}
					if (q.val == val) {

						p.next = q.next;
						q = q.next;
					} else if (q.val != val) {
						p = q;
						q = q.next;
					}

				}
			}
			return head;
		}
         */

    }
}
