package github.qe7.client.event.impl;

import github.qe7.client.event.Event;
import github.qe7.client.event.EventDirection;
import net.minecraft.src.Packet;

public class EventPacket extends Event {

    private Packet packet;
    private EventDirection direction;
    private boolean cancelled;

    public EventPacket(EventDirection direction, Packet packet) {
        this.packet = packet;
        this.direction = direction;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    @Override
    public EventDirection getDirection() {
        return direction;
    }

    @Override
    public void setDirection(EventDirection direction) {
        this.direction = direction;
    }

    public boolean isOutgoing() {
        return this.direction == EventDirection.OUTGOING;
    }

    public boolean isIncoming() {
        return this.direction == EventDirection.INCOMING;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
