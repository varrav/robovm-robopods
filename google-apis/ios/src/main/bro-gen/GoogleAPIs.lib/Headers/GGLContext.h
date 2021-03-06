@import Foundation;

@class GGLConfiguration;
@class GGLIdentity;

/**
 * Main entry point for Google API core configuration. Developers should call
 * -[[GGLContext sharedInstance] configureWithError:] to configure the integrated services such as
 * AdMob, Analytics, AppInvite, CloudMessaging, SignIn, etc. See GGLContext+ServiceName
 * for details on the individual APIs. Generally, you will import those files
 * directly rather than import the GGLContext.h header itself.
 *
 * Once the appropriate categories are imported, you can configure all services via the
 * |configureWithError:| method, for example:
 *
 * NSError* configureError;
 * [[GGLContext sharedInstance] configureWithError: &configureError];
 * if (configureError != nil) {
 *   NSLog(@"Error configuring the Google context: %@", configureError);
 * }
 *
 * @see GGLContext (AdMob)
 * @see GGLContext (Analytics)
 * @see GGLContext (AppInvite)
 * @see GGLContext (CloudMessaging)
 * @see GGLContext (SignIn)
 */
@interface GGLContext : NSObject

/**
 * The configuration details for various Google APIs.
 */
@property(nonatomic, readonly, strong) GGLConfiguration *configuration;

/**
 * Get the shared instance of the GGLContext.
 * @return the shared instance
 */
+ (instancetype)sharedInstance;

/**
 * Configures all the Google services integrated. This method should be called after the app is
 * launched and before using other Google services. The services will be available in categories
 * that extend this class, such as GGLContext+AdMob.
 *
 * @param error Pointer to an NSError that can be used an out param to report the status of this
 * operation. After the call the error object will be nil if the operation is succesful,
 * otherwise contains an appropriate NSError value. Parameter cannot be passed as nil
 *
 * @warning error must not be nil.
 *
 */
- (void)configureWithError:(NSError **)error;

@end