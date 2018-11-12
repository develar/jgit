import static java.nio.charset.StandardCharsets.UTF_8;
/**
 * Patch header describing an action for a single file path.
 */
	public FileHeader(byte[] headerLines, EditList edits, PatchType type) {
	FileHeader(byte[] b, int offset) {
	/**
	 * Get the byte array holding this file's patch script.
	 *
	 * @return the byte array holding this file's patch script.
	 */
	/**
	 * Get offset of the start of this file's script in {@link #getBuffer()}.
	 *
	 * @return offset of the start of this file's script in
	 *         {@link #getBuffer()}.
	 */
	/**
	 * Get offset one past the end of the file script.
	 *
	 * @return offset one past the end of the file script.
	 */
	 * The default character encoding
	 * ({@link java.nio.charset.StandardCharsets#UTF_8}) is assumed for both the
	 * old and new files.
			if (cs == null) {
				cs = UTF_8;
			}
		for (HunkHeader h : getHunks())
	private static boolean trySimpleConversion(Charset[] charsetGuess) {
	private String[] extractFileLines(Charset[] csGuess) {
			for (HunkHeader h : getHunks())
				if (cs == null) {
					cs = UTF_8;
				}
	/**
	 * Get style of patch used to modify this file.
	 *
	 * @return style of patch used to modify this file.
	 */
	/**
	 * Whether this patch modifies metadata about a file
	 *
	 * @return {@code true} if this patch modifies metadata about a file .
	 */
	/**
	 * Get hunks altering this file; in order of appearance in patch
	 *
	 * @return hunks altering this file; in order of appearance in patch.
	 */
	void addHunk(HunkHeader h) {
			hunks = new ArrayList<>();
	HunkHeader newHunkHeader(int offset) {
	/**
	 * Get the new-image delta/literal if this is a
	 * {@link PatchType#GIT_BINARY}.
	 *
	 * @return the new-image delta/literal if this is a
	 *         {@link PatchType#GIT_BINARY}.
	 */
	/**
	 * Get the old-image delta/literal if this is a
	 * {@link PatchType#GIT_BINARY}.
	 *
	 * @return the old-image delta/literal if this is a
	 *         {@link PatchType#GIT_BINARY}.
	 */
	/**
	 * Convert to a list describing the content edits performed on this file.
	 *
	 * @return a list describing the content edits performed on this file.
	 */
		for (HunkHeader hunk : hunks)
	int parseGitFileName(int ptr, int end) {
					oldPath = decode(UTF_8, buf, aStart, sp - 1);
	int parseGitHeaders(int ptr, int end) {
	void parseOldName(int ptr, int eol) {
	void parseNewName(int ptr, int eol) {
	void parseNewFileMode(int ptr, int eol) {
	int parseTraditionalHeaders(int ptr, int end) {
	private String parseName(String expect, int ptr, int end) {
			r = decode(UTF_8, buf, ptr, tab - 1);
	FileMode parseFileMode(int ptr, int end) {
	void parseIndexLine(int ptr, int end) {
	static int isHunkHdr(byte[] buf, int start, int end) {