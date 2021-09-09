package deployment.comp2;


import deployment.Comp2;
import deployment.shareable.DataItem;

import interfaces.IDataExchange;

import io.ciera.runtime.summit.exceptions.BadArgumentException;
import io.ciera.runtime.summit.exceptions.XtumlException;
import io.ciera.runtime.summit.interfaces.IMessage;
import io.ciera.runtime.summit.interfaces.IPort;
import io.ciera.runtime.summit.interfaces.Port;


public class Comp2Server extends Port<Comp2> implements IDataExchange {

    public Comp2Server( Comp2 context, IPort<?> peer ) {
        super( context, peer );
    }

    // inbound messages
    public void XferInst( final DataItem p_theData ) throws XtumlException {
    }



    // outbound messages


    @Override
    public void deliver( IMessage message ) throws XtumlException {
        if ( null == message ) throw new BadArgumentException( "Cannot deliver null message." );
        switch ( message.getId() ) {
            case IDataExchange.SIGNAL_NO_XFERINST:
                XferInst(DataItem.deserialize(message.get(0)));
                break;
        default:
            throw new BadArgumentException( "Message not implemented by this port." );
        }
    }



    @Override
    public String getName() {
        return "Server";
    }

}
