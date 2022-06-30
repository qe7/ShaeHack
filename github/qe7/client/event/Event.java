package github.qe7.client.event;

public class Event {

    private boolean cancelled;
    private EventType type;
    private EventDirection direction;

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    public EventDirection getDirection() {
        return direction;
    }

    public void setDirection(EventDirection direction) {
        this.direction = direction;
    }

    public boolean isPre() {
        if (!(type == null)) {
            return type == EventType.PRE;
        } else {
            return false;
        }
    }

    public boolean isPost() {
        if (!(type == null)) {
            return type == EventType.POST;
        } else {
            return false;
        }
    }

    public boolean isIncoming() {
        if (!(direction == null)) {
            return direction == EventDirection.INCOMING;
        } else {
            return false;
        }
    }

    public boolean isOutgoing() {
        if (!(direction == null)) {
            return direction == EventDirection.OUTGOING;
        } else {
            return false;
        }
    }

}
