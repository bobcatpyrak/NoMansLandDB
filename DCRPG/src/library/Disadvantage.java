package library;

import java.util.ArrayList;
import java.util.List;

public enum Disadvantage 
{
	BLACKOUT("Blackout", 3, "<html>During high-pressure situations, this character has a tendency to blackout for several minutes.  They have no recollection of this lost time.  The character might black out whenever they roll a Nat 1, based on a failed Willpower roll.  Failure means that they fall unconscious for 3 turns or 3 minutes without interference.</html>", false),
	CENTER_OF_CONVERSATION("Center of Conversation", 1, "<html>The character feels the need to be in the middle of every conversation, whether they know what they�re talking about or not.  This is a narrative disadvantage.</html>", false),
	CHILDISH_APPEARANCE("Childish Appearance", 1, "<html>This character is young or looks young, and as such, they very rarely receive the respect they deserve.  All intimidation and persuasion rolls against characters older than the player character are rolled with a -1 modifier.</html>", false),
	COWARDICE("Cowardice", 2, "<html>The hero is easy to intimidate, and as such, always rolls with disadvantage against Intimidation and Interrogation rolls.</html>", false),
	DARK_SECRET("Dark Secret", 1, "<html>The character possesses some information or has performed some action, where, should it come to light or resurface, could prove dangerous to the character or those around him/her.  This is a narrative Disadvantage.</html>", true),
	DEBT("Debt", 2, "<html>This character owes a debt of some form, and when the debtor demands repayment, the player character MUST provide it.  This is a narrative disadvantage.</html>", true),
	DELUSIONS_OF_GRANDEUR("Delusions of Grandeur", 3, "<html>The character is convinced they are the best at what they do.  If this fact is tested by someone else, including another player character, the delusional player character must roll at least a Skilled DL Willpower roll to control themselves.  If they do not, they must immediately stop any activity and argue with the source of dissent.</html>", false),
	EXTREMELY_COMPETITIVE("Extremely Competitive", 2, "<html>A player character who considers themselves skilled in one or more ways may often challenge their fellow party members or other NPCs to bets or competitions based on those abilities.  This can potentially scuttle social interactions; the player may make an average Willpower roll to quell their raging competitiveness.</html>", false),
	FANATIC("Fanatic", 3, "<html>The character is incredibly dedicated to a philosophical ideal.  This ideal is so important that they will attempt to defend or uphold it, even if it would cost them their life.   Only with Master Willpower rolls can they control themselves long enough to avoid their beliefs scuttling whatever social interaction in which they are involved.</html>", true),
	FORGETFUL("Forgetful", 4, "<html>Only available if the character has Knowledge less than 5.  A forgetful character rolls any Scholar or Arcane Lore roll with disadvantage.  Cannot be taken with Obscure Knowledge.</html>", false),
	FUGITIVE("Fugitive", 3, "<html>The character is wanted by law enforcement for a crime they may or may not have committed.  When interacting with the society where he/she is wanted, the fugitive character may face repercussions if they are not disguised, hidden, or using other mitigating circumstances to roam free.</html>", true),
	HIDES_EMOTIONS("Hides Emotions", 1, "<html>The character rolls with disadvantage on non-specialized Charm rolls.</html>", false),
	ILLITERATE("Illiterate", 3, "<html>The character cannot read, and as such, is incapable of taking Arcane Lore, Computer Ops, and Scholar.  They also cannot use Languages for written language-related rolls.</html>", false),
	IMPULSIVENESS("Impulsiveness", 2, "<html>The character has little thought for their consequences, often rushing into peril without a plan unless someone stops them.  This is a narrative disadvantage.</html>", false),
	INFAMY("Infamy", 2, "<html>In a particular field of influence, this character has achieved a level of disrespect and negative recognition that forces them to raise Charm, Bluff, Intimidation, Interrogation and Persuasion roll difficulties with fellow members of that field of influence by 1.</html>", true),
	KLEPTOMANIACAL_TENDENCIES("Kleptomaniacal Tendencies", 2, "<html>If the character sees something they consider valuable, they must make a successful Skilled willpower roll to resist the urge to steal it.</html>", false),
	LONG_WINDED("Long-Winded", 1, "<html>The character feels the need to expound forever on any subject when given the opportunity, whether they know what they�re talking about or not.  This is a narrative disadvantage.</html>", false),
	LOW_SELF_ESTEEM("Low Self-Esteem", 2, "<html>The character constantly berates themselves or has no confidence in their own abilities.  As such, the DM may roll a D6 during what might be considered important actions performed by the player character - if a 1 is rolled, the player character will suffer a -2 to their modifier on rolls pertaining to that important action.</html>", false),
	MEDICAL_PROBLEM("Medical Problem/Psychological Disorder", 6, "<html>The player character suffers from a very serious physical ailment.  This may result in modifier penalties for rolls related to the medical issue, and is decided by the player and the DM during character creation.  Examples can include diseases requiring constant medication, partial paralysis, loss of a sense, loss of a limb, etc.</html>", true),
	NARCISSISTIC("Narcissistic", 3, "<html>The character rolls any raw Presence or Perception rolls with a -1 modifier thanks to their self-absorption.</html>", false),
	NIGHTMARES("Nightmares", 4, "<html>Every night, the player suffers from horrible nightmares.  As a result, the character must make an Average DL Willpower roll successfully, lest they suffer -1 modifiers on all skill rolls for the next 24 hour period.</html>", false),
	OBSESSIVE_TENDENCIES("Obsessive Tendencies", 2, "<html>The character is totally focused on some specified course of action once it is decided upon.  If others break from this plan, the character suffers a -1 penalty on all Perception-related rolls until they can reassess the situation.</html>", false),
	PATHOLOGICAL_LIAR("Pathological Liar", 2, "<html>Whenever the player is confronted with a question, they must make a d10 roll.  If that roll is a 1, they are compelled to lie or immensely exaggerate in response.</html>", false),
	PARANOIA("Paranoia", 3, "<html>This character believes there is a massive plot against them.  As such, they may not trust other characters, or even their own party.  This is a narrative disadvantage.</html>", false),
	PHOBIA("Phobia", 5, "<html>Whenever the hero is in the presence of the object of their fear, all attribute and skill rolls are decreased by -5.  The effect lasts until the object of their fear is removed.</html>", true),
	SECRET_IDENTITY("Secret Identity", 3, "<html>The character has a civilian identity that, if compromised, could affect their friends and family, putting them at significant risk.  Can only be taken if a character has Dependents.</html>", false),
	SHADY_BACKGROUND("Shady Background", 2, "<html>The character has a criminal or shady history, as such, they begin the campaign with an additional 4 villain points, and suffer a -1 modifier to Charm, Bluff and Persuasion when rolled against superheroes.</html>", false),
	TARGETED_FOR_ASSASSINATION("Targeted for Assassination", 2, "<html>A specific criminal organization is after the player character, and as such, they will find themselves dealing with opponents in that organization who target them in combat at the expense of other player characters, as well as facing members of this organization in scenarios with upgraded weapons and equipment.</html>", true),
	TECHNOLOGICALLY_CHALLENGED("Technologically Challenged", 5, "<html>Only available for specific races.  This character is from an alternative society where technology at the standards of a modern Earth�s might not be readily available.  As such, the character suffers a -5 modifier to Computer Ops rolls, and a -2 to Security rolls.</html>", false),
	UNATTRACTIVE_APPEARANCE("Unattractive Appearance", 2, "<html>The character might be classified as ugly.  As such, this character must roll with disadvantage on any Seduction roll involving a character who has the capacity to be attracted by the player character�s gender or species.</html>", false),
	UNCOORDINATED("Uncoordinated", 5, "<html>If the character has less than level 4 Coordination, they are entitled to purchase this disadvantage, which attaches disadvantage to all raw Coordination rolls.</html>", false);
	
	;
	
	private final String nameD;
	private final int cost;
	private final String description;
	private final boolean param;
	
	
	Disadvantage(String nameD, int cost, String description, boolean param)
	{
		this.nameD = nameD;
		this.cost = cost;
		this.description = description;
		this.param = param;
	}
	
	public String nameD()
	{
		return nameD;
	}
	
	public int cost()
	{
		return cost;
	}
	
	public String description()
	{
		return description;
	}
	public boolean param()
	{
		return param;
	}
	
	public static List<Disadvantage> getAll()
	{
		List<Disadvantage> d = new ArrayList<Disadvantage>();
		d.add(BLACKOUT);
		d.add(CENTER_OF_CONVERSATION);
		d.add(CHILDISH_APPEARANCE);
		d.add(COWARDICE);
		d.add(DARK_SECRET);
		d.add(DEBT);
		d.add(DELUSIONS_OF_GRANDEUR);
		d.add(EXTREMELY_COMPETITIVE);
		d.add(FANATIC);
		d.add(FORGETFUL);
		d.add(FUGITIVE);
		d.add(HIDES_EMOTIONS);
		d.add(ILLITERATE);
		d.add(IMPULSIVENESS);
		d.add(INFAMY);
		d.add(KLEPTOMANIACAL_TENDENCIES);
		d.add(LONG_WINDED);
		d.add(LOW_SELF_ESTEEM);
		d.add(MEDICAL_PROBLEM);
		d.add(NARCISSISTIC);
		d.add(NIGHTMARES);
		d.add(OBSESSIVE_TENDENCIES);
		d.add(PARANOIA);
		d.add(PATHOLOGICAL_LIAR);
		d.add(PHOBIA);
		d.add(SECRET_IDENTITY);
		d.add(SHADY_BACKGROUND);
		d.add(TARGETED_FOR_ASSASSINATION);
		d.add(TECHNOLOGICALLY_CHALLENGED);
		d.add(UNATTRACTIVE_APPEARANCE);
		d.add(UNCOORDINATED);
		
		return d;
	}
}
