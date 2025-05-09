package kinoko.provider.quest.act;

import kinoko.packet.user.QuestPacket;
import kinoko.provider.ItemProvider;
import kinoko.world.user.User;

public final class QuestBuffAct implements QuestAct {
    private final int buffItemId;

    public QuestBuffAct(int buffItemId) {
        this.buffItemId = buffItemId;
    }

    @Override
    public boolean canAct(User user, int rewardIndex) {
        if (ItemProvider.getItemInfo(buffItemId).isEmpty()) {
            user.write(QuestPacket.failedUnknown());
            return false;
        }
        return true;
    }

    @Override
    public boolean doAct(User user, int rewardIndex) {
        user.setConsumeItemEffect(ItemProvider.getItemInfo(buffItemId).orElseThrow());
        return true;
    }
}
