package CI283.assignment.scheduler;
/**
 * The Round Robin Scheduler. This scheduler takes the next process from the head of a list,
 * allows it to run then puts it back at the end of the list (unless the state of process is
 * TERMINATED).
 *
 * @author Jim Burton <j.burton@brighton.ac.uk>
 */

import java.util.ArrayList;
import java.util.List;

public class RRScheduler extends Scheduler {

    /**
     * Create a new RRScheduler with the given quantum. The constructor needs to call the constructor
     * of the superclass, then initialise the list of processes.
     * @param quantum
     */
    public RRScheduler(long quantum) {
        super(quantum);
    }

    /**
     * Add a process to the list.
     * @param p
     */
    @Override
    public void enqueue(Process p) {

    }

    /**
     * Schedule the processes. This method needs to:
     * + create an empty list which will hold the completed processes. This will be the
     *   return value of the method.
     * + while the queue is not empty:
     *   - take the next process from the queue and get its State.
     *   - if the state is NEW, start the process then sleep for QUANTUM milliseconds
     *     then put the process at the back of the queue.
     *   - if the state is TERMINATED, add it to the results list.
     *   - if the state is anything else then interrupt the process to wake it up then
     *     sleep for QUANTUM milliseconds, then put the process at the back of the queue.
     *  + when the queue is empty, return the list of completed processes.
     * @return
     */
    @Override
    public List<Process> startScheduling() {
        ArrayList<Process> results = new ArrayList<>();

        return results;
    }
}
