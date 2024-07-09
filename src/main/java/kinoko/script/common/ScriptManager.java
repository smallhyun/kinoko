package kinoko.script.common;

import kinoko.provider.reward.Reward;
import kinoko.server.event.EventState;
import kinoko.server.event.EventType;
import kinoko.util.Tuple;
import kinoko.world.field.Field;
import kinoko.world.field.mob.MobAppearType;
import kinoko.world.quest.QuestRecordType;
import kinoko.world.user.User;

import java.util.List;
import java.util.Map;

public interface ScriptManager {
    // USER METHODS ----------------------------------------------------------------------------------------------------

    User getUser();

    void dispose();

    void message(String message);

    void scriptProgressMessage(String message);

    void playPortalSE();

    void balloonMsg(String text, int width, int duration);

    void setDirectionMode(boolean set, int delay);

    void avatarOriented(String effectPath);

    void squibEffect(String effectPath);

    void reservedEffect(String effectPath);

    void screenEffect(String effectPath);

    void soundEffect(String effectPath);


    // STAT METHODS ----------------------------------------------------------------------------------------------------

    int getGender();

    int getLevel();

    void addExp(int exp);

    void setAvatar(int look);

    void setConsumeItemEffect(int itemId);

    void resetConsumeItemEffect(int itemId);


    // INVENTORY METHODS -----------------------------------------------------------------------------------------------

    boolean addMoney(int money);

    boolean canAddMoney(int money);

    boolean addItem(int itemId, int quantity);

    boolean addItems(List<Tuple<Integer, Integer>> items);

    boolean canAddItem(int itemId, int quantity);

    boolean canAddItems(List<Tuple<Integer, Integer>> items);

    boolean removeItem(int itemId, int quantity);

    boolean hasItem(int itemId);

    boolean hasItem(int itemId, int quantity);

    int getItemCount(int itemId);


    // QUEST METHODS ---------------------------------------------------------------------------------------------------

    boolean hasQuestStarted(int questId);

    boolean hasQuestCompleted(int questId);

    void forceStartQuest(int questId);

    void forceCompleteQuest(int questId);

    String getQRValue(QuestRecordType questRecordType);

    void setQRValue(QuestRecordType questRecordType, String value);


    // WARP METHODS ----------------------------------------------------------------------------------------------------

    void warp(int mapId);

    void warp(int mapId, String portalName);

    void warpInstance(int mapId, String portalName, int returnMap, int timeLimit);

    void warpInstance(List<Integer> mapIds, String portalName, int returnMap, int timeLimit);

    void partyWarpInstance(int mapId, String portalName, int returnMap, int timeLimit);

    void partyWarpInstance(List<Integer> mapIds, String portalName, int returnMap, int timeLimit);


    // FIELD METHODS ---------------------------------------------------------------------------------------------------

    Field getField();

    int getFieldId();

    EventState getEventState(EventType eventType);

    void spawnMob(int templateId, MobAppearType appearType, int x, int y);

    void dropRewards(List<Reward> rewards);


    // CONVERSATION METHODS --------------------------------------------------------------------------------------------

    int getSpeakerId();

    void setSpeakerId(int speakerId);

    void setNotCancellable(boolean notCancellable);

    void setPlayerAsSpeaker(boolean playerAsSpeaker);

    void setFlipSpeaker(boolean flipSpeaker);

    void sayOk(String text);

    void sayPrev(String text);

    void sayNext(String text);

    void sayBoth(String text);

    void sayImage(List<String> images);

    boolean askYesNo(String text);

    boolean askAccept(String text);

    int askMenu(String text, Map<Integer, String> options);

    int askSlideMenu(int type, Map<Integer, String> options);

    int askAvatar(String text, List<Integer> options);

    int askNumber(String text, int numberDefault, int numberMin, int numberMax);

    String askText(String text, String textDefault, int textLengthMin, int textLengthMax);

    String askBoxText(String text, String textDefault, int textBoxColumns, int textBoxLines);
}