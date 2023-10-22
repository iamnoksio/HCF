package io.noks.hcf.caches;

import java.util.Map;
import java.util.UUID;

import io.noks.hcf.enums.FactionRank;

public class Faction {
	private String name;
	private UUID leader;
	private Map<UUID, FactionRank> members;
}
