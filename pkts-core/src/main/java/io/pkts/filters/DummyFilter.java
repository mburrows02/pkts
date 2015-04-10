package io.pkts.filters;

import io.pkts.packet.Packet;

public class DummyFilter implements Filter {

	@Override
	public boolean accept(Packet packet) throws FilterException {
		// TODO Auto-generated method stub
		return false;
	}

}
