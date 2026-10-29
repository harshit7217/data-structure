<h1>Queue</h1>

<h2>Defination</h3>

<p>A queue is an order list in which insertion are done at the end <b>rear</b> and deletion are done at other end <b>front</b>. The first element to be inserted is the first one and to be deleted. Hence, it is called FIFO.</p>

<h2>Main Queue Operation</h4>
<ul>
  <li><b>Enqueue: </b> Insertion in Queue</li>
  <li><b>Dequeue: </b> Deletion in Queue</li>
</ul>

<h2>Application</h3>

<ol>
  <li>Operation system schedule job</li>
  <li>Ticket Counter</li>
  <li>Multiprogramming</li>
  <li>Asynchronous data transfer</li>
  <li>Waiting time of customers at call center</li>
</ol>

<h2>Implementation</h3>

<ul>
  <li><a href="https://github.com/harshit7217/Queue/blob/main/src/implementation/queueWithSimpleArray/QueueWithSimpleArray.java">Simple circular array based implementation</a></li>
  <li><a href="https://github.com/harshit7217/Queue/blob/main/src/implementation/dynamicCicularArray/Queue.java">Dynamic circular array based implementation</a></li>
  <li><a href="https://github.com/harshit7217/Queue/blob/main/src/implementation/queueWithLinkedList/Queue.java">Linked List Implementation</a></li>
</ul>

<h3>Performance and Limitation of Simple circular array based implementation</h4>

<table>
  <tr>
    <th>Space Complexity</th>
    <td>O(n)</td>
  </tr>
  <tr>
    <th>Time Complexity of enQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of deQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isEmpty</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isFull</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of size</th>
    <td>O(1)</td>
  </tr>
</table>

<p>The maximum size of queue must be defined as prior and cannot be changed.</p>

<h3>Performance of Dynamic Circular Array Implementation</h3>

<table>
  <tr>
    <th>Space Complexity</th>
    <td>O(n)</td>
  </tr>
  <tr>
    <th>Time Complexity of enQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of deQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isEmpty</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isFull</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of size</th>
    <td>O(1)</td>
  </tr>
</table>

<h3>Performance of Linked List Implementation</h3>

<table>
  <tr>
    <th>Space Complexity</th>
    <td>O(n)</td>
  </tr>
  <tr>
    <th>Time Complexity of enQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of deQueue</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isEmpty</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of isFull</th>
    <td>O(1)</td>
  </tr>
  <tr>
  <th>Time Complexity of size</th>
    <td>O(1)</td>
  </tr>
</table>

<h2>Problems</h2>

<ol>
    <li><a href="https://github.com/harshit7217/Queue/blob/main/src/problems/ReversingQueue.java">Reverse Queue</a></li>
    <li><a href="https://github.com/harshit7217/Queue/blob/main/src/problems/ImplementationQueueUsingStack.java">Implementation Queue using Stack</a></li>
    <li><a href="https://github.com/harshit7217/Queue/blob/main/src/problems/ImplementationStackUsingQueue.java">Implementation Stack using Queue</a></li>
</ol>